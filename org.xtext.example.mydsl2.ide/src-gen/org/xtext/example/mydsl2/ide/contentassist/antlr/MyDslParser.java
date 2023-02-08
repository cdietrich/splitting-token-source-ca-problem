/*
 * generated by Xtext unknown
 */
package org.xtext.example.mydsl2.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl2.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getDefAccess().getGroup(), "rule__Def__Group__0");
			builder.put(grammarAccess.getUseAccess().getGroup(), "rule__Use__Group__0");
			builder.put(grammarAccess.getModelAccess().getDefsAssignment_0(), "rule__Model__DefsAssignment_0");
			builder.put(grammarAccess.getModelAccess().getUsesAssignment_1(), "rule__Model__UsesAssignment_1");
			builder.put(grammarAccess.getDefAccess().getNameAssignment_1(), "rule__Def__NameAssignment_1");
			builder.put(grammarAccess.getUseAccess().getDefRefsAssignment_2(), "rule__Use__DefRefsAssignment_2");
			builder.put(grammarAccess.getDefRefAccess().getDefAssignment(), "rule__DefRef__DefAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
