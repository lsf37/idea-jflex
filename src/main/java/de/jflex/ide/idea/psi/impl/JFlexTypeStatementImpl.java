package de.jflex.ide.idea.psi.impl;

import com.intellij.lang.ASTNode;
import de.jflex.ide.idea.psi.JFlexTypeStatement;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class JFlexTypeStatementImpl extends JFlexOptionStatementBase implements JFlexTypeStatement {

    public JFlexTypeStatementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
