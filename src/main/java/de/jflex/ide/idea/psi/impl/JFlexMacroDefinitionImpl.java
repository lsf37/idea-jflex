package de.jflex.ide.idea.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import de.jflex.ide.idea.JFlexElementTypes;
import de.jflex.ide.idea.psi.JFlexMacroDefinition;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class JFlexMacroDefinitionImpl extends JFlexElementImpl implements JFlexMacroDefinition {

    public JFlexMacroDefinitionImpl(@NotNull ASTNode node) {
        super(node);
    }

    public ASTNode findNameElement() {
        return getNode().findChildByType(JFlexElementTypes.MACROS);
    }

    public PsiElement getNameElement() {
        ASTNode node = findNameElement();
        return node != null ? node.getPsi() : null;
    }

    public String getName() {
        ASTNode node = findNameElement();
        return node != null ? node.getText() : null;
    }

    public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        throw new IncorrectOperationException();
    }

}
