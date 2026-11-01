/*
 * Decompiled with CFR 0.152.
 */
package luaj.lib;

import luaj.LuaValue;
import luaj.lib.LibFunction;

abstract class TableLibFunction
extends LibFunction {
    TableLibFunction() {
    }

    @Override
    public LuaValue call() {
        return LuaValue.k0(1, "table expected, got no value");
    }
}

