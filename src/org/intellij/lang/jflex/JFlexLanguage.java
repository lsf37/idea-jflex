package org.intellij.lang.jflex;

import com.intellij.lang.Commenter;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.documentation.DocumentationProvider;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.intellij.lang.jflex.fileTypes.JFlexSyntaxHighlighter;
import org.intellij.lang.jflex.validation.JFlexAnnotatingVisitor;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * JFlex language.
 *
 * @author Alexey Efimov
 */
public class JFlexLanguage extends Language {
    @NonNls
    private static final String ID = "JFlex";

    private static final Annotator ANNOTATOR = new JFlexAnnotatingVisitor();
    private static final DocumentationProvider DOCPROV = new JFlexDocumentationProvider();
    private static final FindUsagesProvider FUP = new JFlexFindUsagesProvider();
    private static final Commenter COMMENTER = new JFlexCommenter();

    private static ParserDefinition pd;

    public JFlexLanguage() {
        super(ID);
    }

    @NotNull
    public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
        return new JFlexSyntaxHighlighter(project, virtualFile);
    }

    @Nullable
    public ParserDefinition getParserDefinition() {
        if (pd == null) {
            pd = new JFlexParserDefinition();
        }
        return pd;
    }

    @Nullable
    public Annotator getAnnotator() {
        return ANNOTATOR;
    }

    @Nullable
    public DocumentationProvider getDocumentationProvider() {
        return DOCPROV;
    }

    @NotNull
    public FindUsagesProvider getFindUsagesProvider() {
        return FUP;
    }

    @Nullable
    public Commenter getCommenter() {
        return COMMENTER;
    }
}