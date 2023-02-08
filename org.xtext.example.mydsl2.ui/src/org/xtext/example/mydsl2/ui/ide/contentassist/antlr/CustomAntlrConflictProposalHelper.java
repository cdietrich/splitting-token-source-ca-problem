package org.xtext.example.mydsl2.ui.ide.contentassist.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AntlrProposalConflictHelper;
import org.xtext.example.mydsl2.parser.antlr.MyDslSplittingTokenSource;

/**
 *
 */
public class CustomAntlrConflictProposalHelper extends AntlrProposalConflictHelper {

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

    @Override
    public TokenSource getProposalLexer() {
        return new MyDslSplittingTokenSource(super.getProposalLexer());
    }

    @Override
    public TokenSource getCombinedLexer() {
        return new MyDslSplittingTokenSource(super.getCombinedLexer());
    }

    @Override
    public TokenSource getLastCompleteLexer() {
        return new MyDslSplittingTokenSource(super.getLastCompleteLexer());
    }

}
