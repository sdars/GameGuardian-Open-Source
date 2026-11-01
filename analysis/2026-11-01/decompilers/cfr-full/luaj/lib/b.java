/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import java.nio.file.Files;
import java.nio.file.Path;

public abstract class b {
    public static /* bridge */ /* synthetic */ Path a(Path path) {
        return Files.readSymbolicLink(path);
    }
}

