package org.xtext.example.mydsl2.ui.ide.contentassist.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AntlrProposalConflictHelper;
import org.xtext.example.mydsl2.parser.antlr.MyDslSplittingTokenSource;
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;

import com.google.inject.Inject;

/**
 *
 */
public class CustomAntlrConflictProposalHelper extends AntlrProposalConflictHelper {
	
	@Inject
	private MyDslGrammarAccess ga;
	
	@Override
	public boolean existsConflict(String proposal, ContentAssistContext context) {
		for (EObject o : context.getFirstSetGrammarElements()) {
			if (o instanceof RuleCall) {
				if (o == ga.getUseAccess().getDefRefsDefRefParserRuleCall_2_0()) {
					//return false;
				}
			}
		}
		return super.existsConflict(proposal, context);
		
	}
	

    @Override
    protected void initTokenSource(String text, TokenSource tokenSource, ContentAssistContext context) {
        if (tokenSource instanceof MyDslSplittingTokenSource) {
            Lexer lexer = (Lexer) ((MyDslSplittingTokenSource) tokenSource).getDelegate();
            CharStream stream = new ANTLRStringStream(text);
            lexer.setCharStream(stream);
            return;
        }
        Lexer lexer = (Lexer) tokenSource;
        CharStream stream = new ANTLRStringStream(text);
        lexer.setCharStream(stream);
    }
    
    @Override
    protected boolean equalTokenSequence(TokenSource first, TokenSource second) {
    	System.err.println("f:" + first + " s: "+ second);
    	return super.equalTokenSequence(first, second);
    }
    
//    TokenSource pl;
//    @Override
//    public TokenSource getProposalLexer() {
//    	if (pl == null) {
//    		pl = new MyDslSplittingTokenSource(super.getProposalLexer());
//    	}
//        return pl ;
//    }
//    
//    TokenSource cl;
//
//    @Override
//    public TokenSource getCombinedLexer() {
//    	if (cl == null) {
//    		cl = new MyDslSplittingTokenSource(super.getCombinedLexer());
//    	}
//        return cl;
//    }
//    
//    TokenSource lcl;
//
//    @Override
//    public TokenSource getLastCompleteLexer() {
//    	if (lcl == null) {
//    		lcl = new MyDslSplittingTokenSource(super.getLastCompleteLexer());
//    	}
//        return lcl;
//    }
    
    @Override
  	public boolean existsConflict(String lastCompleteText, String proposal, ContentAssistContext context) {
  		initTokenSources(lastCompleteText, proposal, context);
  		TokenSource lastCompleteLexer = new MyDslSplittingTokenSource(getLastCompleteLexer());
  		TokenSource combinedLexer = new MyDslSplittingTokenSource(getCombinedLexer());
  		TokenSource proposalLexer = new MyDslSplittingTokenSource(getProposalLexer());
  		
  		if (!equalTokenSequence(lastCompleteLexer, combinedLexer))
  			return true;
  		if (!equalTokenSequence(proposalLexer, combinedLexer))
  			return true;
  		Token lastToken = proposalLexer.nextToken();
  		if (!lastToken.equals(Token.EOF_TOKEN))
  			return true;
  		return false;
  	}

}
