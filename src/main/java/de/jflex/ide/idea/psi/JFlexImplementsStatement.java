package de.jflex.ide.idea.psi;

/**
 * @author Max
 */

/**
 * %implements "interface 1"[, "interface 2", ..]
 */
public interface JFlexImplementsStatement extends JFlexElement {

    public JFlexExpression[] getInterfaces();

}
