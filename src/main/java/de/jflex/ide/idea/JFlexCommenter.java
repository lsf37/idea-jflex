package de.jflex.ide.idea;

import com.intellij.lang.Commenter;
import org.jetbrains.annotations.Nullable;

/**
 * @author Max
 */
public class JFlexCommenter implements Commenter {

  @Nullable
  public String getBlockCommentPrefix() {
    return null;
  }

  @Nullable
  public String getBlockCommentSuffix() {
    return null;
  }

  @Nullable
  public String getLineCommentPrefix() {
    return "//";
  }

  public String getCommentedBlockCommentSuffix() {
    return null;
  }

  public String getCommentedBlockCommentPrefix() {
    return null;
  }
}
