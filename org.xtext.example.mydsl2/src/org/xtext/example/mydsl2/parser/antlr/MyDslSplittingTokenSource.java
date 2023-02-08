package org.xtext.example.mydsl2.parser.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractSplittingTokenSource;
import org.eclipse.xtext.parser.antlr.ITokenAcceptor;
import org.xtext.example.mydsl2.parser.antlr.internal.InternalMyDslParser;

public class MyDslSplittingTokenSource extends AbstractSplittingTokenSource {
	
	public MyDslSplittingTokenSource(TokenSource delegate) {
        setDelegate(delegate);
    }

	@Override
	protected boolean shouldSplitToken(Token candidate) {
		return candidate.getType() == InternalMyDslParser.RULE_ID;
	}

	@Override
	protected void doSplitToken(Token splitMe, ITokenAcceptor acceptor) {
		if (splitMe instanceof CommonToken) {
			CommonToken commonToken = (CommonToken) splitMe;
			String text = splitMe.getText();
			int index = 0;
			for (char c : text.toCharArray()) {
				CommonToken token = new CommonToken(InternalMyDslParser.RULE_ID);
				token.setText("" + c);
				token.setChannel(Token.DEFAULT_CHANNEL);
				token.setStartIndex(commonToken.getStartIndex() + index);
				token.setStopIndex(commonToken.getStartIndex() + index);
//	                        token.setLine(commonToken.getLine());
//	                        token.setCharPositionInLine(commonToken.getCharPositionInLine() + index);
				// token.setTokenIndex(commonToken.getTokenIndex()+index);
				token.setInputStream(commonToken.getInputStream());
				System.err.println("xxxx" + token);
				acceptor.accept(token);
				index++;
			}
		}

	}

}
