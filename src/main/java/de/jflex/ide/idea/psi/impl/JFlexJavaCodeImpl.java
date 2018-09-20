package de.jflex.ide.idea.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.LiteralTextEscaper;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLanguageInjectionHost;
import com.intellij.psi.impl.source.tree.injected.InjectedLanguageUtil;
import de.jflex.ide.idea.JFlexElementTypes;
import de.jflex.ide.idea.injection.EmbeddedJavaLiteralTextEscaper;
import de.jflex.ide.idea.psi.JFlexJavaCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author Max
 */
public class JFlexJavaCodeImpl extends JFlexElementImpl implements JFlexJavaCode {

    public JFlexJavaCodeImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public boolean isValidHost() {
        return true;
    }

    public boolean isMatchAction() {
        ASTNode prev = getNode().getTreePrev();
        return prev != null && prev.getElementType() == JFlexElementTypes.LEFT_BRACE;
    }

    @Nullable
    @Deprecated
    public List<Pair<PsiElement, TextRange>> getInjectedPsi() {
        return InjectedLanguageUtil.getInjectedPsiFiles(this);
    }

    public void processInjectedPsi(@NotNull InjectedPsiVisitor visitor) {
        InjectedLanguageUtil.enumerate(this, visitor);
    }

    public PsiLanguageInjectionHost updateText(@NotNull String text) {
        return this;
    }

    public void fixText(@NotNull String text) {
    }

    @NotNull
    public LiteralTextEscaper<JFlexJavaCode> createLiteralTextEscaper() {
        return new EmbeddedJavaLiteralTextEscaper(this);
    }
}
