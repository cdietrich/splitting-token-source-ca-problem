package org.xtext.example.mydsl2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "'use'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_defs_0_0= ruleDef ) )* ( (lv_uses_1_0= ruleUse ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_defs_0_0 = null;

        EObject lv_uses_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_defs_0_0= ruleDef ) )* ( (lv_uses_1_0= ruleUse ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_defs_0_0= ruleDef ) )* ( (lv_uses_1_0= ruleUse ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_defs_0_0= ruleDef ) )* ( (lv_uses_1_0= ruleUse ) )* )
            // InternalMyDsl.g:79:3: ( (lv_defs_0_0= ruleDef ) )* ( (lv_uses_1_0= ruleUse ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_defs_0_0= ruleDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_defs_0_0= ruleDef )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_defs_0_0= ruleDef )
            	    // InternalMyDsl.g:81:5: lv_defs_0_0= ruleDef
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDefsDefParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_defs_0_0=ruleDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"defs",
            	    						lv_defs_0_0,
            	    						"org.xtext.example.mydsl2.MyDsl.Def");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_uses_1_0= ruleUse ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_uses_1_0= ruleUse )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_uses_1_0= ruleUse )
            	    // InternalMyDsl.g:100:5: lv_uses_1_0= ruleUse
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getUsesUseParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_uses_1_0=ruleUse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"uses",
            	    						lv_uses_1_0,
            	    						"org.xtext.example.mydsl2.MyDsl.Use");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDef"
    // InternalMyDsl.g:121:1: entryRuleDef returns [EObject current=null] : iv_ruleDef= ruleDef EOF ;
    public final EObject entryRuleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDef = null;


        try {
            // InternalMyDsl.g:121:44: (iv_ruleDef= ruleDef EOF )
            // InternalMyDsl.g:122:2: iv_ruleDef= ruleDef EOF
            {
             newCompositeNode(grammarAccess.getDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDef=ruleDef();

            state._fsp--;

             current =iv_ruleDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDef"


    // $ANTLR start "ruleDef"
    // InternalMyDsl.g:128:1: ruleDef returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:135:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:135:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:136:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDefAccess().getDefKeyword_0());
            		
            // InternalMyDsl.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDef"


    // $ANTLR start "entryRuleUse"
    // InternalMyDsl.g:162:1: entryRuleUse returns [EObject current=null] : iv_ruleUse= ruleUse EOF ;
    public final EObject entryRuleUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUse = null;


        try {
            // InternalMyDsl.g:162:44: (iv_ruleUse= ruleUse EOF )
            // InternalMyDsl.g:163:2: iv_ruleUse= ruleUse EOF
            {
             newCompositeNode(grammarAccess.getUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUse=ruleUse();

            state._fsp--;

             current =iv_ruleUse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUse"


    // $ANTLR start "ruleUse"
    // InternalMyDsl.g:169:1: ruleUse returns [EObject current=null] : ( () otherlv_1= 'use' ( (lv_defRefs_2_0= ruleDefRef ) )* ) ;
    public final EObject ruleUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_defRefs_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:175:2: ( ( () otherlv_1= 'use' ( (lv_defRefs_2_0= ruleDefRef ) )* ) )
            // InternalMyDsl.g:176:2: ( () otherlv_1= 'use' ( (lv_defRefs_2_0= ruleDefRef ) )* )
            {
            // InternalMyDsl.g:176:2: ( () otherlv_1= 'use' ( (lv_defRefs_2_0= ruleDefRef ) )* )
            // InternalMyDsl.g:177:3: () otherlv_1= 'use' ( (lv_defRefs_2_0= ruleDefRef ) )*
            {
            // InternalMyDsl.g:177:3: ()
            // InternalMyDsl.g:178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseAccess().getUseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getUseAccess().getUseKeyword_1());
            		
            // InternalMyDsl.g:188:3: ( (lv_defRefs_2_0= ruleDefRef ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:189:4: (lv_defRefs_2_0= ruleDefRef )
            	    {
            	    // InternalMyDsl.g:189:4: (lv_defRefs_2_0= ruleDefRef )
            	    // InternalMyDsl.g:190:5: lv_defRefs_2_0= ruleDefRef
            	    {

            	    					newCompositeNode(grammarAccess.getUseAccess().getDefRefsDefRefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_defRefs_2_0=ruleDefRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"defRefs",
            	    						lv_defRefs_2_0,
            	    						"org.xtext.example.mydsl2.MyDsl.DefRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUse"


    // $ANTLR start "entryRuleDefRef"
    // InternalMyDsl.g:211:1: entryRuleDefRef returns [EObject current=null] : iv_ruleDefRef= ruleDefRef EOF ;
    public final EObject entryRuleDefRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefRef = null;


        try {
            // InternalMyDsl.g:211:47: (iv_ruleDefRef= ruleDefRef EOF )
            // InternalMyDsl.g:212:2: iv_ruleDefRef= ruleDefRef EOF
            {
             newCompositeNode(grammarAccess.getDefRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefRef=ruleDefRef();

            state._fsp--;

             current =iv_ruleDefRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefRef"


    // $ANTLR start "ruleDefRef"
    // InternalMyDsl.g:218:1: ruleDefRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDefRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:224:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyDsl.g:225:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyDsl.g:225:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:226:3: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:226:3: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:227:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDefRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getDefRefAccess().getDefDefCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefRef"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});

}