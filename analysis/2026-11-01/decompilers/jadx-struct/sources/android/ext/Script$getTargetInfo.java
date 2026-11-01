package android.ext;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import luaj.LuaTable;
import luaj.LuaValue;
import luaj.Varargs;

/* JADX INFO: loaded from: classes.dex */
final class Script$getTargetInfo extends Script$ApiFunction {
    Script$getTargetInfo() {
    }

    @Override // android.ext.Script$ApiFunction
    protected int Y2() {
        return 0;
    }

    @Override // android.ext.Script$ApiFunction
    public Varargs b3(Varargs varargs) {
        LuaValue luaValue;
        ActivityInfo[] activityInfoArr;
        LuaValue luaValue2 = LuaValue.f1673c;
        z1$d z1_d = MainService.instance.v0;
        if (z1_d != null) {
            String str = z1_d.f1434c;
            try {
                PackageInfo packageInfoA0 = Tools.A0(str, 1);
                if (packageInfoA0 == null) {
                    return luaValue2;
                }
                LuaTable luaTable = new LuaTable();
                luaTable.b2("packageName", z1_d.f1434c);
                luaTable.b2("cmdLine", z1_d.f1432a);
                luaTable.b2("name", z1_d.f1433b);
                luaTable.b2("nativeLibraryDir", z1_d.f1435d);
                luaTable.a2("pid", z1_d.f1437f);
                luaTable.a2("uid", z1_d.f1438g);
                luaTable.c2("x64", z1_d.n ? LuaValue.f1674d : LuaValue.f1675e);
                luaTable.a2("RSS", z1_d.o);
                luaTable.Z1("firstInstallTime", packageInfoA0.firstInstallTime);
                luaTable.Z1("lastUpdateTime", packageInfoA0.lastUpdateTime);
                String str2 = packageInfoA0.packageName;
                if (str2 != null) {
                    luaTable.b2("packageName", str2);
                }
                String str3 = packageInfoA0.sharedUserId;
                if (str3 != null) {
                    luaTable.b2("sharedUserId", str3);
                }
                luaTable.a2("sharedUserLabel", packageInfoA0.sharedUserLabel);
                luaTable.a2("versionCode", packageInfoA0.versionCode);
                String str4 = packageInfoA0.versionName;
                if (str4 != null) {
                    luaTable.b2("versionName", str4);
                }
                PackageManager packageManagerB0 = Tools.B0();
                if (packageInfoA0.activities == null || packageManagerB0 == null) {
                    luaValue = luaValue2;
                } else {
                    LuaTable luaTable2 = new LuaTable();
                    ActivityInfo[] activityInfoArr2 = packageInfoA0.activities;
                    int length = activityInfoArr2.length;
                    int i = 0;
                    int i2 = 1;
                    while (i < length) {
                        ActivityInfo activityInfo = activityInfoArr2[i];
                        if (activityInfo == null) {
                            luaValue = luaValue2;
                            activityInfoArr = activityInfoArr2;
                        } else {
                            luaValue = luaValue2;
                            try {
                                LuaTable luaTable3 = new LuaTable();
                                activityInfoArr = activityInfoArr2;
                                try {
                                    String str5 = activityInfo.name;
                                    if (str5 != null) {
                                        luaTable3.h2("name", str5);
                                    }
                                    luaTable3.h2("label", activityInfo.loadLabel(packageManagerB0).toString());
                                    int i3 = i2 + 1;
                                    try {
                                        luaTable2.e2(i2, luaTable3);
                                        i2 = i3;
                                    } catch (Throwable th) {
                                        th = th;
                                        i2 = i3;
                                        e1.s("Failed get activity info", th);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                activityInfoArr = activityInfoArr2;
                            }
                        }
                        try {
                            i++;
                            luaValue2 = luaValue;
                            activityInfoArr2 = activityInfoArr;
                        } catch (PackageManager$NameNotFoundException e2) {
                            e = e2;
                        }
                    }
                    luaValue = luaValue2;
                    luaTable.c2("activities", luaTable2);
                }
                if (packageManagerB0 != null) {
                    try {
                        luaTable.b2("installer", packageManagerB0.getInstallerPackageName(str));
                    } catch (Throwable th4) {
                        e1.s("Failed get installer", th4);
                    }
                    try {
                        luaTable.a2("enabledSetting", packageManagerB0.getApplicationEnabledSetting(str));
                    } catch (Throwable th5) {
                        e1.s("Failed get enabledSetting", th5);
                    }
                }
                ApplicationInfo applicationInfo = packageInfoA0.applicationInfo;
                if (applicationInfo != null) {
                    String str6 = applicationInfo.backupAgentName;
                    if (str6 != null) {
                        luaTable.b2("backupAgentName", str6);
                    }
                    String str7 = applicationInfo.className;
                    if (str7 != null) {
                        luaTable.b2("className", str7);
                    }
                    String str8 = applicationInfo.dataDir;
                    if (str8 != null) {
                        luaTable.b2("dataDir", str8);
                    }
                    luaTable.a2("descriptionRes", applicationInfo.descriptionRes);
                    luaTable.a2("flags", applicationInfo.flags);
                    luaTable.a2("icon", applicationInfo.icon);
                    luaTable.a2("labelRes", applicationInfo.labelRes);
                    luaTable.a2("logo", applicationInfo.logo);
                    String str9 = applicationInfo.manageSpaceActivityName;
                    if (str9 != null) {
                        luaTable.b2("manageSpaceActivityName", str9);
                    }
                    String str10 = applicationInfo.name;
                    if (str10 != null) {
                        luaTable.b2("name", str10);
                    }
                    String str11 = applicationInfo.nativeLibraryDir;
                    if (str11 != null) {
                        luaTable.b2("nativeLibraryDir", str11);
                    }
                    String str12 = applicationInfo.packageName;
                    if (str12 != null) {
                        luaTable.b2("packageName", str12);
                    }
                    String str13 = applicationInfo.permission;
                    if (str13 != null) {
                        luaTable.b2("permission", str13);
                    }
                    String str14 = applicationInfo.processName;
                    if (str14 != null) {
                        luaTable.b2("processName", str14);
                    }
                    String str15 = applicationInfo.publicSourceDir;
                    if (str15 != null) {
                        luaTable.b2("publicSourceDir", str15);
                    }
                    String str16 = applicationInfo.sourceDir;
                    if (str16 != null) {
                        luaTable.b2("sourceDir", str16);
                    }
                    luaTable.a2("targetSdkVersion", applicationInfo.targetSdkVersion);
                    String str17 = applicationInfo.taskAffinity;
                    if (str17 != null) {
                        luaTable.b2("taskAffinity", str17);
                    }
                    luaTable.a2("theme", applicationInfo.theme);
                    luaTable.a2("uid", applicationInfo.uid);
                    String strA0 = Tools.a0(applicationInfo);
                    if (strA0 != null) {
                        luaTable.b2("label", strA0);
                    }
                }
                return luaTable;
            } catch (PackageManager$NameNotFoundException e3) {
                e = e3;
                luaValue = luaValue2;
            }
            e1.s("Pkg not found: " + str, e);
        } else {
            luaValue = luaValue2;
        }
        return luaValue;
    }

    @Override // android.ext.Script$ApiFunction
    String k3() {
        return "gg.getTargetInfo() -> table || nil";
    }
}
