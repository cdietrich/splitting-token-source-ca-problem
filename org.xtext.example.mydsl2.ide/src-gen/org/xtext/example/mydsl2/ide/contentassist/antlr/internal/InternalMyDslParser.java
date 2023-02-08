package org.xtext.example.mydsl2.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDef"
    // InternalMyDsl.g:78:1: entryRuleDef : ruleDef EOF ;
    public final void entryRuleDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDef EOF )
            // InternalMyDsl.g:80:1: ruleDef EOF
            {
             before(grammarAccess.getDefRule()); 
            pushFollow(FOLLOW_1);
            ruleDef();

            state._fsp--;

             after(grammarAccess.getDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDef"


    // $ANTLR start "ruleDef"
    // InternalMyDsl.g:87:1: ruleDef : ( ( rule__Def__Group__0 ) ) ;
    public final void ruleDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Def__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Def__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Def__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Def__Group__0 )
            {
             before(grammarAccess.getDefAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Def__Group__0 )
            // InternalMyDsl.g:94:4: rule__Def__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Def__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDef"


    // $ANTLR start "entryRuleUse"
    // InternalMyDsl.g:103:1: entryRuleUse : ruleUse EOF ;
    public final void entryRuleUse() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleUse EOF )
            // InternalMyDsl.g:105:1: ruleUse EOF
            {
             before(grammarAccess.getUseRule()); 
            pushFollow(FOLLOW_1);
            ruleUse();

            state._fsp--;

             after(grammarAccess.getUseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUse"


    // $ANTLR start "ruleUse"
    // InternalMyDsl.g:112:1: ruleUse : ( ( rule__Use__Group__0 ) ) ;
    public final void ruleUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Use__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Use__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Use__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Use__Group__0 )
            {
             before(grammarAccess.getUseAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Use__Group__0 )
            // InternalMyDsl.g:119:4: rule__Use__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Use__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUse"


    // $ANTLR start "entryRuleDefRef"
    // InternalMyDsl.g:128:1: entryRuleDefRef : ruleDefRef EOF ;
    public final void entryRuleDefRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleDefRef EOF )
            // InternalMyDsl.g:130:1: ruleDefRef EOF
            {
             before(grammarAccess.getDefRefRule()); 
            pushFollow(FOLLOW_1);
            ruleDefRef();

            state._fsp--;

             after(grammarAccess.getDefRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefRef"


    // $ANTLR start "ruleDefRef"
    // InternalMyDsl.g:137:1: ruleDefRef : ( ( rule__DefRef__DefAssignment ) ) ;
    public final void ruleDefRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__DefRef__DefAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__DefRef__DefAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__DefRef__DefAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__DefRef__DefAssignment )
            {
             before(grammarAccess.getDefRefAccess().getDefAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__DefRef__DefAssignment )
            // InternalMyDsl.g:144:4: rule__DefRef__DefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DefRef__DefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDefRefAccess().getDefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefRef"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:152:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:157:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:164:1: rule__Model__Group__0__Impl : ( ( rule__Model__DefsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( ( ( rule__Model__DefsAssignment_0 )* ) )
            // InternalMyDsl.g:169:1: ( ( rule__Model__DefsAssignment_0 )* )
            {
            // InternalMyDsl.g:169:1: ( ( rule__Model__DefsAssignment_0 )* )
            // InternalMyDsl.g:170:2: ( rule__Model__DefsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getDefsAssignment_0()); 
            // InternalMyDsl.g:171:2: ( rule__Model__DefsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:171:3: rule__Model__DefsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__DefsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:179:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:183:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:184:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:190:1: rule__Model__Group__1__Impl : ( ( rule__Model__UsesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:194:1: ( ( ( rule__Model__UsesAssignment_1 )* ) )
            // InternalMyDsl.g:195:1: ( ( rule__Model__UsesAssignment_1 )* )
            {
            // InternalMyDsl.g:195:1: ( ( rule__Model__UsesAssignment_1 )* )
            // InternalMyDsl.g:196:2: ( rule__Model__UsesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getUsesAssignment_1()); 
            // InternalMyDsl.g:197:2: ( rule__Model__UsesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:197:3: rule__Model__UsesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__UsesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUsesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Def__Group__0"
    // InternalMyDsl.g:206:1: rule__Def__Group__0 : rule__Def__Group__0__Impl rule__Def__Group__1 ;
    public final void rule__Def__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( rule__Def__Group__0__Impl rule__Def__Group__1 )
            // InternalMyDsl.g:211:2: rule__Def__Group__0__Impl rule__Def__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Def__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Def__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__0"


    // $ANTLR start "rule__Def__Group__0__Impl"
    // InternalMyDsl.g:218:1: rule__Def__Group__0__Impl : ( 'def' ) ;
    public final void rule__Def__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:222:1: ( ( 'def' ) )
            // InternalMyDsl.g:223:1: ( 'def' )
            {
            // InternalMyDsl.g:223:1: ( 'def' )
            // InternalMyDsl.g:224:2: 'def'
            {
             before(grammarAccess.getDefAccess().getDefKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDefAccess().getDefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__0__Impl"


    // $ANTLR start "rule__Def__Group__1"
    // InternalMyDsl.g:233:1: rule__Def__Group__1 : rule__Def__Group__1__Impl ;
    public final void rule__Def__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:237:1: ( rule__Def__Group__1__Impl )
            // InternalMyDsl.g:238:2: rule__Def__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Def__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__1"


    // $ANTLR start "rule__Def__Group__1__Impl"
    // InternalMyDsl.g:244:1: rule__Def__Group__1__Impl : ( ( rule__Def__NameAssignment_1 ) ) ;
    public final void rule__Def__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:1: ( ( ( rule__Def__NameAssignment_1 ) ) )
            // InternalMyDsl.g:249:1: ( ( rule__Def__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:249:1: ( ( rule__Def__NameAssignment_1 ) )
            // InternalMyDsl.g:250:2: ( rule__Def__NameAssignment_1 )
            {
             before(grammarAccess.getDefAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:251:2: ( rule__Def__NameAssignment_1 )
            // InternalMyDsl.g:251:3: rule__Def__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Def__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__Group__1__Impl"


    // $ANTLR start "rule__Use__Group__0"
    // InternalMyDsl.g:260:1: rule__Use__Group__0 : rule__Use__Group__0__Impl rule__Use__Group__1 ;
    public final void rule__Use__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( rule__Use__Group__0__Impl rule__Use__Group__1 )
            // InternalMyDsl.g:265:2: rule__Use__Group__0__Impl rule__Use__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Use__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Use__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use__Group__0"


    // $ANTLR start "rule__Use__Group__0__Impl"
    // InternalMyDsl.g:272:1: rule__Use__Group__0__Impl : ( () ) ;
    public final void rule__Use__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:276:1: ( ( () ) )
            // InternalMyDsl.g:277:1: ( () )
            {
            // InternalMyDsl.g:277:1: ( () )
            // InternalMyDsl.g:278:2: ()
            {
             before(grammarAccess.getUseAccess().getUseAction_0()); 
            // InternalMyDsl.g:279:2: ()
            // InternalMyDsl.g:279:3: 
            {
            }

             after(grammarAccess.getUseAccess().getUseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use__Group__0__Impl"


    // $ANTLR start "rule__Use__Group__1"
    // InternalMyDsl.g:287:1: rule__Use__Group__1 : rule__Use__Group__1__Impl rule__Use__Group__2 ;
    public final void rule__Use__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( rule__Use__Group__1__Impl rule__Use__Group__2 )
            // InternalMyDsl.g:292:2: rule__Use__Group__1__Impl rule__Use__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Use__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Use__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use__Group__1"


    // $ANTLR start "rule__Use__Group__1__Impl"
    // InternalMyDsl.g:299:1: rule__Use__Group__1__Impl : ( 'use' ) ;
    public final void rule__Use__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:303:1: ( ( 'use' ) )
            // InternalMyDsl.g:304:1: ( 'use' )
            {
            // InternalMyDsl.g:304:1: ( 'use' )
            // InternalMyDsl.g:305:2: 'use'
            {
             before(grammarAccess.getUseAccess().getUseKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUseAccess().getUseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use__Group__1__Impl"


    // $ANTLR start "rule__Use__Group__2"
    // InternalMyDsl.g:314:1: rule__Use__Group__2 : rule__Use__Group__2__Impl ;
    public final void rule__Use__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( rule__Use__Group__2__Impl )
            // InternalMyDsl.g:319:2: rule__Use__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Use__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use__Group__2"


    // $ANTLR start "rule__Use__Group__2__Impl"
    // InternalMyDsl.g:325:1: rule__Use__Group__2__Impl : ( ( rule__Use__DefRefsAssignment_2 )* ) ;
    public final void rule__Use__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:329:1: ( ( ( rule__Use__DefRefsAssignment_2 )* ) )
            // InternalMyDsl.g:330:1: ( ( rule__Use__DefRefsAssignment_2 )* )
            {
            // InternalMyDsl.g:330:1: ( ( rule__Use__DefRefsAssignment_2 )* )
            // InternalMyDsl.g:331:2: ( rule__Use__DefRefsAssignment_2 )*
            {
             before(grammarAccess.getUseAccess().getDefRefsAssignment_2()); 
            // InternalMyDsl.g:332:2: ( rule__Use__DefRefsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:332:3: rule__Use__DefRefsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Use__DefRefsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getUseAccess().getDefRefsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use__Group__2__Impl"


    // $ANTLR start "rule__Model__DefsAssignment_0"
    // InternalMyDsl.g:341:1: rule__Model__DefsAssignment_0 : ( ruleDef ) ;
    public final void rule__Model__DefsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( ( ruleDef ) )
            // InternalMyDsl.g:346:2: ( ruleDef )
            {
            // InternalMyDsl.g:346:2: ( ruleDef )
            // InternalMyDsl.g:347:3: ruleDef
            {
             before(grammarAccess.getModelAccess().getDefsDefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefsDefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefsAssignment_0"


    // $ANTLR start "rule__Model__UsesAssignment_1"
    // InternalMyDsl.g:356:1: rule__Model__UsesAssignment_1 : ( ruleUse ) ;
    public final void rule__Model__UsesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:360:1: ( ( ruleUse ) )
            // InternalMyDsl.g:361:2: ( ruleUse )
            {
            // InternalMyDsl.g:361:2: ( ruleUse )
            // InternalMyDsl.g:362:3: ruleUse
            {
             before(grammarAccess.getModelAccess().getUsesUseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUse();

            state._fsp--;

             after(grammarAccess.getModelAccess().getUsesUseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UsesAssignment_1"


    // $ANTLR start "rule__Def__NameAssignment_1"
    // InternalMyDsl.g:371:1: rule__Def__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Def__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:375:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:376:2: ( RULE_ID )
            {
            // InternalMyDsl.g:376:2: ( RULE_ID )
            // InternalMyDsl.g:377:3: RULE_ID
            {
             before(grammarAccess.getDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Def__NameAssignment_1"


    // $ANTLR start "rule__Use__DefRefsAssignment_2"
    // InternalMyDsl.g:386:1: rule__Use__DefRefsAssignment_2 : ( ruleDefRef ) ;
    public final void rule__Use__DefRefsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:390:1: ( ( ruleDefRef ) )
            // InternalMyDsl.g:391:2: ( ruleDefRef )
            {
            // InternalMyDsl.g:391:2: ( ruleDefRef )
            // InternalMyDsl.g:392:3: ruleDefRef
            {
             before(grammarAccess.getUseAccess().getDefRefsDefRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefRef();

            state._fsp--;

             after(grammarAccess.getUseAccess().getDefRefsDefRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Use__DefRefsAssignment_2"


    // $ANTLR start "rule__DefRef__DefAssignment"
    // InternalMyDsl.g:401:1: rule__DefRef__DefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__DefRef__DefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:406:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:406:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:407:3: ( RULE_ID )
            {
             before(grammarAccess.getDefRefAccess().getDefDefCrossReference_0()); 
            // InternalMyDsl.g:408:3: ( RULE_ID )
            // InternalMyDsl.g:409:4: RULE_ID
            {
             before(grammarAccess.getDefRefAccess().getDefDefIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefRefAccess().getDefDefIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getDefRefAccess().getDefDefCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefRef__DefAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});

}