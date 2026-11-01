/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.ProviderInfo
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.ParcelFileDescriptor
 */
package d;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;

public abstract class c
extends ContentProvider {
    private static final String[] a = new String[]{"_display_name", "_size"};

    private static Object[] a(Object[] objectArray, int n3) {
        Object[] objectArray2 = new Object[n3];
        System.arraycopy(objectArray, 0, objectArray2, 0, n3);
        return objectArray2;
    }

    private static String[] b(String[] stringArray, int n3) {
        String[] stringArray2 = new String[n3];
        System.arraycopy(stringArray, 0, stringArray2, 0, n3);
        return stringArray2;
    }

    private static File c(Uri object) {
        String string2 = object.getPath();
        if (string2 != null && string2.endsWith(".apk")) {
            object = string2;
            if (!string2.startsWith("/")) {
                object = new StringBuilder();
                ((StringBuilder)object).append("/");
                ((StringBuilder)object).append(string2);
                object = ((StringBuilder)object).toString();
            }
            object = new File((String)object);
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("/wrong_path/");
            ((StringBuilder)object).append(string2);
            object = new File(((StringBuilder)object).toString());
        }
        return object;
    }

    public static Uri d(Context context, String string2, File file) {
        return new Uri.Builder().scheme("content").authority(string2).encodedPath(file.getAbsolutePath()).build();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public int delete(Uri uri, String string2, String[] stringArray) {
        return 0;
    }

    public String getType(Uri uri) {
        return "application/vnd.android.package-archive";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String string2) {
        return ParcelFileDescriptor.open((File)c.c(uri), (int)0x10000000);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Cursor query(Uri objectArray, String[] matrixCursor, String stringArray, String[] object, String stringArray2) {
        stringArray = c.c((Uri)objectArray);
        objectArray = matrixCursor;
        if (matrixCursor == null) {
            objectArray = a;
        }
        String[] stringArray3 = new String[objectArray.length];
        matrixCursor = new Object[objectArray.length];
        int n3 = objectArray.length;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            int n6;
            block8: {
                block7: {
                    String string2;
                    block6: {
                        if (n4 >= n3) {
                            stringArray = c.b(stringArray3, n5);
                            objectArray = c.a((Object[])matrixCursor, n5);
                            matrixCursor = new MatrixCursor(stringArray, 1);
                            matrixCursor.addRow(objectArray);
                            return matrixCursor;
                        }
                        string2 = objectArray[n4];
                        if (!"_display_name".equals(string2)) break block6;
                        stringArray3[n5] = "_display_name";
                        n6 = n5 + 1;
                        matrixCursor[n5] = stringArray.getName();
                        n5 = n6;
                        break block7;
                    }
                    n6 = n5;
                    if (!"_size".equals(string2)) break block8;
                    stringArray3[n5] = "_size";
                    n6 = n5 + 1;
                    matrixCursor[n5] = Long.valueOf(stringArray.length());
                    n5 = n6;
                }
                n6 = n5;
            }
            ++n4;
            n5 = n6;
        }
    }

    public int update(Uri uri, ContentValues contentValues, String string2, String[] stringArray) {
        throw new UnsupportedOperationException("No external updates");
    }
}

