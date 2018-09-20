package de.jflex.ide.idea.psi.impl;

import com.intellij.lang.ASTNode;
import de.jflex.ide.idea.psi.JFlexSection;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class JFlexSectionImpl extends JFlexElementImpl implements JFlexSection {

    public JFlexSectionImpl(@NotNull ASTNode node) {
        super(node);
    }

}
