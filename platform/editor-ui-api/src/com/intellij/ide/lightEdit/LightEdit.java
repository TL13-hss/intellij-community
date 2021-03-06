// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ide.lightEdit;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A wrapping class around {@code LightEditService} methods.
 */
public final class LightEdit {
  private LightEdit() {
  }

  public static boolean owns(@Nullable Project project) {
    return LightEditService.getInstance().owns(project);
  }

  public static boolean openFile(@NotNull VirtualFile file) {
    return LightEditService.getInstance().openFile(file);
  }

}
