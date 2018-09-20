package de.jflex.ide.idea.psi.impl;

import com.intellij.lang.ASTNode;
import de.jflex.ide.idea.psi.JFlexRegexp;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class JFlexRegexpImpl extends JFlexElementImpl implements JFlexRegexp {

    public JFlexRegexpImpl(@NotNull ASTNode node) {
        super(node);
    }

}
