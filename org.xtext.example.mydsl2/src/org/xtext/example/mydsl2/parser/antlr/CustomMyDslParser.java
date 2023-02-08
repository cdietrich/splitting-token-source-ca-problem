package org.xtext.example.mydsl2.parser.antlr;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;

public class CustomMyDslParser extends MyDslParser {
	@Override
    protected TokenSource createLexer(CharStream stream) {
        return new MyDslSplittingTokenSource(super.createLexer(stream));
    }
}
