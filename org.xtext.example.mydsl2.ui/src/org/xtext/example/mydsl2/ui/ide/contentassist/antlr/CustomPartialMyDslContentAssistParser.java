package org.xtext.example.mydsl2.ui.ide.contentassist.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.xtext.example.mydsl2.ide.contentassist.antlr.PartialMyDslContentAssistParser;
import org.xtext.example.mydsl2.parser.antlr.MyDslSplittingTokenSource;

public class CustomPartialMyDslContentAssistParser extends PartialMyDslContentAssistParser {
	@Override
    protected TokenSource createLexer(CharStream stream) {
        return new MyDslSplittingTokenSource(super.createLexer(stream));
    }

}
