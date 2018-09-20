package de.jflex.ide.idea.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;

/**
 * @author Max
 */
public interface JFlexMacroDefinition extends JFlexElement, PsiNamedElement {

    PsiElement getNameElement();

}
