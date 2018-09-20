package de.jflex.ide.idea.psi;

import org.jetbrains.annotations.Nullable;

/**
 * @author Max
 */

/**
 * "Class options and user class code" section statement
 */
public interface JFlexOptionStatement extends JFlexStatement {

    @Nullable
    public JFlexExpression getValue();

}
