package android.ext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
class ConfigListAdapter$a extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConfigListAdapter f54a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigListAdapter$a(ConfigListAdapter configListAdapter, String str) {
        super(str);
        this.f54a = configListAdapter;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(Tools.removeNewLinesChars("kwws=22jdphjxdugldq1qhw2yhuvlrq1w{w")).openStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append('\n');
            }
            bufferedReader.close();
        } catch (Throwable th) {
            e1.l("Load changelog", th);
            sb.append(th.toString());
        }
        n2.i(new ConfigListAdapter$a$a(this, sb));
    }
}
