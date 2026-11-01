package android.ext;

/* JADX INFO: loaded from: /root/gameguardian/tmp/analysis/2026-11-01/classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f1306a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.String f1307b;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        android.text.Editable f1308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1309b;

        public a(android.text.Editable r4) {
                r3 = this;
                r3.<init>()
                r3.f1308a = r4
                r0 = 1
                r3.f1309b = r0
            L8:
                int r1 = r3.f1309b
                int r2 = r4.length()
                if (r1 >= r2) goto L25
                int r1 = r3.f1309b
                char r1 = r4.charAt(r1)
                r2 = 32
                if (r1 == r2) goto L1f
                r2 = 9
                if (r1 == r2) goto L1f
                goto L25
            L1f:
                int r1 = r3.f1309b
                int r1 = r1 + r0
                r3.f1309b = r1
                goto L8
            L25:
                return
        }

        void a(java.lang.String r3) {
                r2 = this;
                int r0 = r2.f1309b
                android.text.Editable r1 = r2.f1308a
                int r1 = r1.length()
                if (r0 > r1) goto L11
                android.text.Editable r0 = r2.f1308a
                int r1 = r2.f1309b
                r0.insert(r1, r3)
            L11:
                int r0 = r2.f1309b
                int r3 = r3.length()
                int r0 = r0 + r3
                r2.f1309b = r0
                return
        }

        void b(int r3, java.lang.String r4) {
                r2 = this;
                int r0 = r2.f1309b
                r2.c(r3)
                int r3 = r2.f1309b
                android.text.Editable r1 = r2.f1308a
                int r1 = r1.length()
                if (r3 > r1) goto L16
                android.text.Editable r3 = r2.f1308a
                int r1 = r2.f1309b
                r3.replace(r0, r1, r4)
            L16:
                int r3 = r2.f1309b
                int r4 = r4.length()
                int r1 = r2.f1309b
                int r1 = r1 - r0
                int r4 = r4 - r1
                int r3 = r3 + r4
                r2.f1309b = r3
                return
        }

        void c(int r4) {
                r3 = this;
                int r4 = r4 * 2
                r0 = 0
            L3:
                if (r0 >= r4) goto L2c
                int r1 = r3.f1309b
            L7:
                int r1 = r1 + 1
                r3.f1309b = r1
                int r1 = r3.f1309b
                android.text.Editable r2 = r3.f1308a
                int r2 = r2.length()
                if (r1 >= r2) goto L29
                android.text.Editable r1 = r3.f1308a
                int r2 = r3.f1309b
                char r1 = r1.charAt(r2)
                r2 = 32
                if (r1 == r2) goto L26
                r2 = 9
                if (r1 == r2) goto L26
                goto L29
            L26:
                int r1 = r3.f1309b
                goto L7
            L29:
                int r0 = r0 + 1
                goto L3
            L2c:
                return
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            android.ext.x0.f1306a = r0
            r0 = 0
            android.ext.x0.f1307b = r0
            return
    }

    private static java.lang.String a() {
            java.lang.String r0 = android.ext.x0.f1307b
            if (r0 != 0) goto L29d
            r0 = 2131296732(0x7f0901dc, float:1.8211389E38)
            java.lang.String r0 = android.ext.b2.f(r0)
            java.lang.String r1 = "~"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.String r1 = "ar"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1f
            java.lang.String r0 = "ًٌٍَُِّْٰءأؤإئاآبةتثجحخدذرزسشصضطظعغفقكلمنهوىي\u061c\u200e٫٬٪‰؉٠١٢٣٤٥٦٧٨٩‐–—،؛؟…«»"
            goto L29b
        L1f:
            java.lang.String r1 = "az"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2b
            java.lang.String r0 = "çəğıİöşüÇƏĞIÖŞÜ‰‐–—…‘’“”§†‡′″аәбвгғдежзийјкҝлмноөпрстуүфхһчҹшыАӘБВГҒДЕЖЗИЙЈКҜЛМНОӨПРСТУҮФХҺЧҸШЫ"
            goto L29b
        L2b:
            java.lang.String r1 = "bg"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L37
            java.lang.String r0 = "абвгдежзийклмнопрстуфхцчшщъьюяАБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЬЮЯ ‰‐–—…‘‚“„§″№"
            goto L29b
        L37:
            java.lang.String r1 = "bn"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L43
            java.lang.String r0 = "়৺অআইঈউঊঋৠঌৡএঐওঔংঃঁক্ষখগঘঙচছজঝঞটঠডঢণতৎথদধনপফবভমযরলশসহঽািীুূৃৄৢৣেৈোৌৗ‰০১২৩৪৫৬৭৮৯‐–—…‘’“”§†‡′″"
            goto L29b
        L43:
            java.lang.String r1 = "bs_BA"
            boolean r1 = r1.equals(r0)
            java.lang.String r3 = "čćžđšČĆŽĐŠ‰‐–—…‘’“”′″абвгдђежзијклљмнњопрстћуфхцчџшАБВГДЂЕЖЗИЈКЛЉМНЊОПРСТЋУФХЦЧЏШ"
            if (r1 == 0) goto L50
        L4d:
            r0 = r3
            goto L29b
        L50:
            java.lang.String r1 = "bs"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L59
            goto L4d
        L59:
            java.lang.String r1 = "ca"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L65
            java.lang.String r0 = "·àçéèíïóòúüÀÇÉÈÍÏÓÒÚÜ‰‐–—¡¿…‘’“”«»§†‡′″"
            goto L29b
        L65:
            java.lang.String r1 = "cs"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L71
            java.lang.String r0 = "áčďéěíňóřšťúůýžÁČĎÉĚÍŇÓŘŠŤÚŮÝŽ ‰‐–…‘‚“„§"
            goto L29b
        L71:
            java.lang.String r1 = "da"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L7d
            java.lang.String r0 = "æøåÆØÅ‰‐–…‘’“”§†′″"
            goto L29b
        L7d:
            java.lang.String r1 = "de"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L89
            java.lang.String r0 = "äößüÄÖÜ‰‐–—…‘‚“„«»§ ’"
            goto L29b
        L89:
            java.lang.String r1 = "el"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L95
            java.lang.String r0 = "αάβγδεέζηήθιίϊΐκλμνξοόπρσςτυύϋΰφχψωώΑΆΒΓΔΕΈΖΗΉΘΙΊΪΚΛΜΝΞΟΌΠΡΣΤΥΎΫΦΧΨΩΏ‰‐–—…«»§"
            goto L29b
        L95:
            java.lang.String r1 = "es"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto La1
            java.lang.String r0 = "áéíïñóúüýÁÉÍÏÑÓÚÜÝ‰‐–—¡¿…‘’“”«»§†‡′″ "
            goto L29b
        La1:
            java.lang.String r1 = "et"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lad
            java.lang.String r0 = "šžõäöüŠŽÕÄÖÜ ‰−“„"
            goto L29b
        Lad:
            java.lang.String r1 = "fa"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lb9
            java.lang.String r0 = "ًٌٍّٔآاءأؤئبپتثجچحخدذرزژسشصضطظعغفقکگلمنوهةی\u200e٫٬٪‰؉−۰۱۲۳۴۵۶۷۸۹‐،؛؟…‹›«»"
            goto L29b
        Lb9:
            java.lang.String r1 = "fi"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lc5
            java.lang.String r0 = "šžåäöŠŽÅÄÖ ‰−‐–…’”»§ñÑ—‘“′″"
            goto L29b
        Lc5:
            java.lang.String r1 = "fr"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Ld1
            java.lang.String r0 = "àâæçéèêëîïôœùûüÿÀÂÆÇÉÈÊËÎÏÔŒÙÛÜŸ ‰−²³ᵈᵉʳˢ‐–—…’“”«»§†‡"
            goto L29b
        Ld1:
            java.lang.String r1 = "hi"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Ldd
            java.lang.String r0 = "़ॐंँःअआइईउऊऋऌऍएऐऑओऔकखगघङचछजझञटठडढणतथदधनपफबभमयरलळवशषसहऽािीुूृॄॅेैॉोौ्‰०१२३४५६७८९‘’“”॰"
            goto L29b
        Ldd:
            java.lang.String r1 = "hr"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Le9
            java.lang.String r0 = "čćžđšČĆŽĐŠ‰‐–—…‘’‚“”„′″"
            goto L29b
        Le9:
            java.lang.String r1 = "hu"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lf5
            java.lang.String r0 = "áéíóöőúüűÁÉÍÓÖŐÚÜŰ ‰–…’”„«»⟨⟩§⁒"
            goto L29b
        Lf5:
            java.lang.String r1 = "in"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L101
            java.lang.String r0 = "‰‐–—…‘’“”"
            goto L29b
        L101:
            java.lang.String r1 = "it"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L10d
            java.lang.String r0 = "àéèìóòùÀÉÈÌÓÒÙ‰—…’“”«»"
            goto L29b
        L10d:
            java.lang.String r1 = "iw"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L119
            java.lang.String r0 = "אבגדהוזחטיכךלמםנןסעפףצץקרשת\u200e‰‐–—׳״־"
            goto L29b
        L119:
            java.lang.String r1 = "ja"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L125
            java.lang.String r0 = "々ゝヽゞヾーぁァあアぃィいイぅゥうウヴぇェえエぉォおオヵかカがガきキぎギくクぐグヶけケげゲこコごゴさサざザしシじジすスずズせセぜゼそソぞゾたタだダちチぢヂっッつツづヅてテでデとトどドなナにニぬヌねネのノはハばバぱパひヒびビぴピふフぶブぷプへヘべベぺペほホぼボぽポまマみミむムめメもモゃャやヤゅュゆユょョよヨらラりリるルれレろロゎヮわワゐヰゑヱをヲんン一丁七万下不与且世丘丙両並中丸丹主久乏乗乙九乱乳乾亀了予争事二互五井亜亡交享亭人仁今介仏仕他付仙代以仮仰仲件任企伏休会伝伯伴伸伺似但位佐体何余作佳併使例侍供依価侮侯侵便係促俊俗保信修俳俵俸俺倉個倍倒候借倣値倫倹偉偏停健側偶偽傍傑傘備催債傷傾働像僕僚僧儀億儒償優元兆先光克免児党入全八六共兵具典兼内円冊再冒冗写冠冬冷准凍凝凡処凶凸出刀刃分刈刊刑列初判別利到制券刺刻則削前剖剛剣剥副剰割創劇力功加劣助努励労効劾勅勇勉動勘務勝募勢勤勧勲包化北匠匹医匿十千升午半卑協南単博占印危即卵卸厄厘厚原厳去参又及収叔取受叙口句叫召可右号司各合吉同向君吟否含吸吹呈告周味呼命和咲哀品員哲唆唇唐唯唱商問啓善喚喜喝喪喫営嗣嘆嘱器噴嚇囚四回因団困囲図固国圏園土圧在地坂均坊坑坪垂型垣埋城域執培基埼堀堂堅堕堤堪報場塀塁塊塑塔塗塚塩填塾境墓増墜墨墳墾壁壇壊壌士壮声売変夏夕外多夜夢大天夫央失奇奉奏契奔奥奨奪奮女奴好如妄妊妙妥妨妹妻姉始姓委姫姻姿威娘娠娯婆婚婦婿媒嫁嫌嫡嬢子孔字存孝季孤学孫宅宇安完宗定宜宝実客室宮宰害家容宿寂寄密富寒寛寝察寡寧審寮寸寺対寿封専射将尉尋導小少尚就尺尼局居屈届屋展属層履屯山岐岡岩岬岳岸峠峡峰島崇崎崩川州巡巣工巨差己巻市布帆希帝帥師席帯帰帳常帽幅幕幣干年幸幹幻幾庁広床序底店府度座庫庭庶庸廃廉廊延廷建弁弊式弐弓引弟弦弧弱張強弾当形彩彫彰影役彼往征径待律後徐徒従得御復循微徳徴徹心必忌忍志忙応忠快念怒怖思怠急性怪恋恐恒恥恨恩恭息恵悔悟悠患悦悩悪悲悼情惑惜惨惰想愁愉意愚愛感慈態慌慎慕慢慣慨慮慰慶憂憎憤憩憲憶憾懇懐懲懸成戒戦戯戸戻房所扇扉手才打払扱扶批承技抄把抑投抗折抜択披抱抵抹押抽担拍拐拒拓拘拙招拝拠拡括拷拾持指挑挙挟振挿捕捜捨据掃授掌排掘掛採探接控推措掲描提揚換握揮援揺損搬搭携搾摂摘摩撃撤撮撲擁操擦擬支改攻放政故敏救敗教敢散敬数整敵敷文斉斎斗料斜斤斥断新方施旅旋族旗既日旧早旬昆昇明易昔星映春昨昭是昼時晩普景晴晶暁暇暑暖暗暦暫暮暴曇曜曲更書曹替最月有服朕朗望朝期木未札朱朴机朽杉材村束条来杯東松板析林枚果枝枠枢枯架柄某染柔柱柳査栄栓校株核根格栽桃案桑桜桟梅械棄棋棒棚棟森棺植検業極楼楽概構様槽標模権横樹橋機欄欠次欧欲欺款歌歓止正武歩歯歳歴死殉残殖殴段殺殻殿母毎毒比毛氏民気水氷永汁求汎汗汚江池決汽沈沖没沢河沸油治沼沿況泉泊泌法泡泣泥注泰泳洋洗洞津洪活派流浄浅浜浦浪浮浴海浸消涙涯液涼淑淡深混添清渇渉渋渓減渡渦温測港湖湯湾満源準溝溶滅滋滑滝滞滴漁漂漆漏演漠漢漫漬漸潔潜潟潤潮澄激濁濃濫濯瀬火灯灰災炉炊炎炭点為烈無焦然焼煙照煩煮熟熱燃燥爆爵父片版牙牛牧物牲特犠犬犯状狂狩独狭猛猟猫献猶猿獄獣獲玄率玉王珍珠班現球理琴環璽瓶甘甚生産用田申男町画界畑畔留畜畝略番異畳疎疑疫疲疾病症痘痛痢痴療癒癖発登白百的皆皇皮皿盆益盗盛盟監盤目盲直相盾省看県真眠眺眼着睡督瞬矛矢知短矯石砂研砕砲破硝硫硬碁碑確磁磨礁礎示礼社祈祉祖祝神祥票祭禁禅禍福秀私秋科秒秘租秩称移程税稚種稲稼稿穀穂積穏穫穴究空突窃窒窓窮窯立竜章童端競竹笑笛符第筆等筋筒答策箇算管箱節範築篤簡簿籍米粉粋粒粗粘粛粧精糖糧糸系糾紀約紅紋納純紙紛素索紫累細紳紹紺終組経結絞絡給統絵絶絹継続維綱網綿緊総緑緒線締編緩緯練縁縄縛縦縫縮績繁繊織繕繭繰缶罪置罰署罷羅羊美群義羽翁翌習翻翼老考者耐耕耗耳聖聞聴職肉肌肖肝肢肥肩肪肯育肺胃胆背胎胞胴胸能脂脅脈脚脱脳腐腕腰腸腹膚膜膨臓臣臨自臭至致興舌舎舗舞舟航般舶船艇艦良色芋芝花芳芸芽苗若苦英茂茎茶草荒荘荷菊菌菓菜華落葉著葬蒸蓄蔵薄薦薪薬藤藩藻虎虐虚虜虞虫蚊蚕蛇蛍蛮融血衆行術街衛衝衡衣表衰衷袋被裁裂装裏裕補裸製複褐褒襟襲西要覆覇見規視覚覧親観角解触言訂計討訓託記訟訪設許訳訴診証詐詔評詞詠試詩詰詳誇誉誌認誓誕誘語誠誤説読誰課調談請論諭諮諸諾謀謁謄謙講謝謡謹識譜警議譲護谷豆豊豚象豪貝貞負貢貧販貫責貯貴買貸費貿賀賃賄資賊賓賛賜賞賠賢賦質購贈赤赦走赴起超越趣足距跡路跳践踊踏躍身車軌軍軒軟転軸軽較載輝輩輪輸轄辛辞辱農辺込迅迎近返迫迭述迷追退送逃逆透逐逓途通逝速造連逮週進逸遂遅遇遊運遍過道違遠遣適遭遮遵遷選遺避還邦邪邸郊郎郡部郭郵郷都酌配酒酔酢酪酬酵酷酸醜醸釈里量金針釣鈍鈴鉄鉛鉢鉱銀銃銅銘銭鋭鋳鋼錠錬錯録鍛鎖鎮鏡鐘鑑長門閉開閑間関閣閥閲闘阪防阻附降限陛院陥陪陰陳陵陶陸険陽隅隆隊階随隔際障隠隣隷隻雄雇雌雑離難雨雪雰雲零雷電需震霊霜霧露青静非面革靴韓音韻響頂頃項順預頒領頬頭頻頼題額顔顕願類顧風飛食飢飯飲飼飾養餓館首香馬駄駆駐騎騒験騰驚骨髄高髪鬼魂魅魔魚鮮鯨鳥鳴鶏鹿麗麦麻黄黒黙鼓鼻齢‰‾＿－‐—―〜・･，、､；：！？．‥…。｡＇‘’＂“”（）［］｛｝〈〉《》「｢」｣『』【】〔〕‖§¶＠＊／＼＆＃％†‡′″〃※"
            goto L29b
        L125:
            java.lang.String r1 = "jw"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L131
            java.lang.String r0 = "âåéèêìòùÂÅÉÈÊÌÒÙ‰"
            goto L29b
        L131:
            java.lang.String r1 = "ka"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13d
            java.lang.String r0 = "აბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰ ‰‐–—…჻‘‚“„«»§†‡′″№čḍɛǧɣḥṛṣṭẓČḌƐǦƔḤṚṢṬẒĩũĨŨ"
            goto L29b
        L13d:
            java.lang.String r1 = "km"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L149
            java.lang.String r0 = "័ៈ់៉៊៍កខគឃងចឆជឈញដឋឌឍណតថទធនបផពភមយរឫឬលឭឮវសហឡអាឥឦឧឩឪឯឰឱឲឳិីឹឺុូួើឿៀេែៃោៅំះ្‰៖។៕‘’“”៙៚"
            goto L29b
        L149:
            java.lang.String r1 = "ko"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L155
            java.lang.String r0 = "가힣‰‾＿－‐—―〜・，、；：！¡？¿．‥…。·＇‘’＂“”（）［］｛｝〈〉《》「」『』【】〔〕§¶＠＊／＼＆＃％†‡′″〃※़०१२३४५६७८९ॐंँःअआइईउऊऋऌऍएऐऑओऔकखगघङचछजझञटठडढणतथदधनपफबभमयरलवशषसहळऽािीुूृॄॅेैॉोौ्–"
            goto L29b
        L155:
            java.lang.String r1 = "la"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L161
            java.lang.String r0 = "áéíɨóúʉÁÉÍƗÓÚɄ"
            goto L29b
        L161:
            java.lang.String r1 = "lo"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16d
            java.lang.String r0 = "່້໊໋໌ໍໆກຂຄງຈສຊຍດຕຖທນບປຜຝພຟມຢຣລວຫໜໝອຮຯະັາຳິີຶືຸູົຼຽເແໂໃໄ‰‐–—…‘’“”§†‡′″"
            goto L29b
        L16d:
            java.lang.String r1 = "lt"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L179
            java.lang.String r0 = "ąčęėįšųūžĄČĘĖĮŠŲŪŽ ‰−‐–—…“„"
            goto L29b
        L179:
            java.lang.String r1 = "lv"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L185
            java.lang.String r0 = "āčēģīķļņšūžĀČĒĢĪĶĻŅŠŪŽ ‰‐–—…‘’‚“”„§†‡′″"
            goto L29b
        L185:
            java.lang.String r1 = "mk"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L191
            java.lang.String r0 = "абвгдѓежзѕијклљмнњопрстќуфхцчџшАБВГДЃЕЖЗЅИЈКЛЉМНЊОПРСТЌУФХЦЧЏШ‰‐–—…‘‚“„"
            goto L29b
        L191:
            java.lang.String r1 = "ms"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L19d
            java.lang.String r0 = "‰‐–—…‘’“”§†‡′″"
            goto L29b
        L19d:
            java.lang.String r1 = "my"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1a9
            java.lang.String r0 = "ကခဂဃငစဆဇဈဉညဋဌဍဎဏတထဒဓနပဖဗဘမယရလဝသဟဠအဣ၏ဤဥဦဧဩဪာါိီုူေဲံဿျြွှ့္်း‰၀၁၂၃၄၅၆၇၈၉၊။‘’“”"
            goto L29b
        L1a9:
            java.lang.String r1 = "nl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1b5
            java.lang.String r0 = "áäéëíḯóöúüÁÄÉËÍÏÓÖÚÜ‰‐–—…‘’“”§†‡′″"
            goto L29b
        L1b5:
            java.lang.String r1 = "pl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1c1
            java.lang.String r0 = "ąćęłńóśźżĄĆĘŁŃÓŚŹŻ ‰‐–—…”„«»§†‡′″°"
            goto L29b
        L1c1:
            java.lang.String r1 = "pt_BR"
            boolean r1 = r1.equals(r0)
            java.lang.String r3 = "áàâãçéêíóòôõúÁÀÂÃÇÉÊÍÓÒÔÕÚ‰‐–—…‘’“”§†‡′″ «»"
            if (r1 == 0) goto L1cd
            goto L4d
        L1cd:
            java.lang.String r1 = "pt_PT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1d7
            goto L4d
        L1d7:
            java.lang.String r1 = "ro"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1e3
            java.lang.String r0 = "ăâîșțĂÂÎȘȚ‰‐–—…‘“”„«»"
            goto L29b
        L1e3:
            java.lang.String r1 = "ru"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1ef
            java.lang.String r0 = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ ‰‐–—…‘‚“„«»§"
            goto L29b
        L1ef:
            java.lang.String r1 = "sk"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1fb
            java.lang.String r0 = "áäčďéíĺľňóôŕšťúýžÁÄČĎÉÍĹĽŇÓÔŔŠŤÚÝŽ ‰‐–…‘‚“„§"
            goto L29b
        L1fb:
            java.lang.String r1 = "sl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L207
            java.lang.String r0 = "čšžČŠŽ‰−–…„‟«»"
            goto L29b
        L207:
            java.lang.String r1 = "sq"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L213
            java.lang.String r0 = "çëÇË ‰‐–—…‘’“”«»§′″"
            goto L29b
        L213:
            java.lang.String r1 = "sr"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21f
            java.lang.String r0 = "абвгдђежзијклљмнњопрстћуфхцчџшАБВГДЂЕЖЗИЈКЛЉМНЊОПРСТЋУФХЦЧЏШ‰‐–…‘‚“„čćžđšČĆŽĐŠ"
            goto L29b
        L21f:
            java.lang.String r1 = "sv"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L22b
            java.lang.String r0 = "àéåäöÀÉÅÄÖ ‰−‐–—…‘’“”§†‡′″"
            goto L29b
        L22b:
            java.lang.String r1 = "th"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L237
            java.lang.String r0 = "ฯๆ๎์็่้๊๋กขฃคฅฆงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรฤลฦวศษสหฬอฮํะัาๅำิีึืุูเแโใไฺ‰‐–—‘’“”…′″"
            goto L29b
        L237:
            java.lang.String r1 = "tl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L242
            java.lang.String r0 = "ñÑ‰‐–—…‘’“”§′″"
            goto L29b
        L242:
            java.lang.String r1 = "tr"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L24d
            java.lang.String r0 = "çğıİöşüÇĞIÖŞÜ‰‐–—…‘’“”§†‡′″"
            goto L29b
        L24d:
            java.lang.String r1 = "uk"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L258
            java.lang.String r0 = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюяʼАБВГҐДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЬЮЯ ‰–’“„«»§№"
            goto L29b
        L258:
            java.lang.String r1 = "ur"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L263
            java.lang.String r0 = "اأآبپتٹثجچحخدڈذرڑزژسشصضطظعغفقکگلمنںوؤہۂھءیئےةه\u200e٫٬‰۰۱۲۳۴۵۶۷۸۹،؍؛؟۔"
            goto L29b
        L263:
            java.lang.String r1 = "uz"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L26e
            java.lang.String r0 = "ʻʼ ‰‐–—…‘’“”„«»§′″ًٌٍَُِّْٰٔءآأؤئابپةتثجچحخدذرزژسشصضطظعغفقکگلمنهوۇۉی\u200e٫٬٪؉−۰۱۲۳۴۵۶۷۸۹абвгғдеёжзийкқлмнопрстуўфхҳчшъэюяАБВГҒДЕЁЖЗИЙКҚЛМНОПРСТУЎФХҲЧШЪЭЮЯ"
            goto L29b
        L26e:
            java.lang.String r1 = "vi"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L279
            java.lang.String r0 = "àảãáạăằẳẵắặâầẩẫấậđèẻẽéẹêềểễếệìỉĩíịòỏõóọôồổỗốộơờởỡớợùủũúụưừửữứựỳỷỹýỵÀẢÃÁẠĂẰẲẴẮẶÂẦẨẪẤẬĐÈẺẼÉẸÊỀỂỄẾỆÌỈĨÍỊÒỎÕÓỌÔỒỔỖỐỘƠỜỞỠỚỢÙỦŨÚỤƯỪỬỮỨỰỲỶỸÝỴ‰‐–—…‘’“”§†‡′″"
            goto L29b
        L279:
            java.lang.String r1 = "zh_CN"
            boolean r1 = r1.equals(r0)
            java.lang.String r3 = "一丁七万与丑专且世丘业东丝丢两严丧个中丰串临丸主丽举乃久么义之乐乔乖乘乙九也乡书买乱乾了予争事二于亏云互五井亚些亡交亨享京亮亲人亿仁仅仇今介仍从仔他付仙代以仪们仰仲件价任份仿企伊伍伏休众会伟传伤伦伯估伴伸似伽但位佑体何余佛作你佤佩佳使例供依侠侦侨侬侯侵便促俄俊俗保信俩修俱俾倍倒候倚借倦值倾假偌偏做停健偶偷储催傲傻像僧儒儿允元兆先光克免兑兔党入全八兮兰共关兹养兽内冈册再冒写军农冠冬冰冲决况冷准凌减凝几凡凤凭凯凰出击函刀分切刊刑划列创初判利别到制券刺刻剂前剑剧剩剪副割力劝务劣动劫励劳势勇勉勋勒勤勾勿包匆匈化北匙匹医十千升午半华协卒卓单南博占卢卫卯危即却卷厂厄历厉压厍厚原去县参又反发叔取叙口另只叭可台史右叶叹吃各合吊同后吐向吓吗君吝吟否吧含听启吵吸吹吻吾呀呆呈告呐员呜呢呦周味呵呼命和咖咦咨咪咬咯咱哀品哇哉响哎哟哥哦哩哪哭哲唉唐唤唬售唯唱唷商啊啡啥啦啪喀喂善喇喊喏喔喜喝喵喷喻嗒嗨嗯嘉嘛嘴嘻嘿器四回因团园困围固国图圆圈土圣在圭地圳场圾址均坎坐坑块坚坜坡坤坦坪垂垃型垒埃埋城埔域培基堂堆堕堡堪塑塔塞填境增墨壁壤士壬壮声处备复夏夕外多夜够夥大天夫央失头夷夺奇奉奋奏契奔奖套奥女奴奶她好如妇妈妖妙妥妨妮妹妻姆姊始姐姑姓委姿威娃娄娘娜娟娱婆婚媒嫁嫌嫩子孔孕字孙孜孝孟季孤学孩宁它宇安宋完宏宗实审室宪害宴家容宽宿寂寄寇富寒寝察寡寨寸对寻导寿封射将尊小少尔尖尘尚尝尤就尺尼尾局层居屋屏展属屠山岁岂岗岘岚岛岳岸峡峰崇崩崴川州巡工巨巫差己巴巷币布帅师希帐帕帖帝带席帮常帽幅幕干年并幸幻幽广庆床序库底店庙庚府庞废度座庭康庸廉廖延廷建开异弄弊式引弗弘弟张弥弦弯弱弹强归当录彝形彩彬彭彰影彷役彻彼往征径待很律後徐徒得循微徵德心必忆忌忍志忙忠忧快念忽怀态怎怒怕怖思怡急性怨怪总恋恐恢恨恩恭息恰恶恼悄悉悔悟悠患您悲情惑惜惠惧惨惯想惹愁愈愉意愚感愧慈慎慕慢慧慰憾懂懒戈戊戌戏戒或战截戴户房扁扇手才扎扑打托扣执扩扫扯批找技抄把抑抓投抗折抢护报披抬抱抵抹抽担拆拉拍拒拔拖拘招拜拟拥拦拨择括拳拷拼拾拿持指按挑挖挝挡挤挥挪振挺捉捐捕损捡换据捷授掉掌排探接控措掸描提插握援搜搞搬搭摄摆摊摔摘摩摸撒撞播操擎擦支收改攻放政故效敌敏救教敝敢散敦敬数敲整文斋斐斗料斜斥断斯新方於施旁旅旋族旗无既日早旭时旺昂昆昌明昏易星映春昨昭是显晃晋晒晓晚晨普景晴晶智暂暑暖暗暮暴曰曲更曹曼曾最月有朋服朗望朝期木未札术朱朵机杀杂权杉李材村杜束条来杨杯杰松板极构析林果枝枢枪枫架柏某染柔查柬柯柳柴标栋栏树校样根格桃框案桌桑档桥梁梅梦梯械梵检棉棋棒棚森椅植椰楚楼概榜模樱檀欠欣欧欲欺款歉歌止武歪死殊残段毅母每毒比毕毛毫氏民气氛水永求汇汉汗汝江污汤汪汶汽沃沈沉沙沟没沧河油治沿泉泊法泛泡泣泥注泰泳泽洋洗洛洞津洪洲活洽派流浅测济浏浑浓浙浦浩浪浮浴海涅消涉涛涨涯液涵淋淑淘淡深混添清渐渡渣温港渴游湖湾源溜溪滋滑满滥滨滴漂漏演漠漫潘潜潮澎澳激灌火灭灯灰灵灿炉炎炮炸点烂烈烤烦烧热焦然煌煞照煮熊熟燃燕爆爪爬爱爵爸爽片版牌牙牛牡牢牧物牲牵特牺犯状犹狂狐狗狠独狮狱狼猛猜猪献猴玄率玉王玛玩玫环现玲玻珀珊珍珠班球理琊琪琳琴琼瑙瑜瑞瑟瑰瑶璃瓜瓦瓶甘甚甜生用田申电男甸画畅界留略番疆疏疑疗疯疲疼疾病痕痛痴癸登白百的皆皇皮盈益监盒盖盘盛盟目直相盼盾省眉看真眠眼着睛睡督瞧矛矣知短石矶码砂砍研破础硕硬确碍碎碗碟碧碰磁磅磨示礼社祖祚祝神祥票祯祸禁禅福离秀私秋种科秒秘租秤秦秩积称移稀程稍税稣稳稿穆究穷穹空穿突窗窝立站竞章童端竹笑笔笛符笨第等筋筑答策筹签简算管箭箱篇篮簿籍米类粉粒粗粤粹精糊糕糖糟系素索紧紫累繁红约级纪纯纲纳纵纷纸纽线练组细终绍经结绕绘给络绝统继绩绪续维绵综绿缅缓编缘缠缩缴缶缸缺罐网罕罗罚罢罪置署羊美羞群羯羽翁翅翔翘翠翰翻翼耀老考者而耍耐耗耳耶聊职联聘聚聪肉肖肚股肤肥肩肯育胁胆背胎胖胜胞胡胶胸能脆脑脱脸腊腐腓腰腹腾腿臂臣自臭至致舌舍舒舞舟航般舰船良色艺艾节芒芝芦芬芭花芳苍苏苗若苦英茂范茨茫茶草荐荒荣药荷莉莎莪莫莱莲获菜菩菲萄萍萤营萧萨落著葛葡蒂蒋蒙蓉蓝蓬蔑蔡薄薪藉藏藤虎虑虫虹虽虾蚁蛇蛋蛙蛮蜂蜜蝶融蟹蠢血行街衡衣补表袋被袭裁裂装裕裤西要覆见观规视览觉角解言誉誓警计订认讨让训记讲讷许论设访证评识诉词译试诗诚话诞询该详语误说请诸诺读课谁调谅谈谊谋谓谜谢谨谱谷豆象豪貌贝负贡败货贪购贯贱贴贵贸贺贼贾资赋赌赏赐赔赖赚赛赞赠赢赤赫走赵起趁超越趋趣足跃跌跑距跟路跳踏踢踩身躲车轨轩转轮轰轻载较辅辆辈辉辑输辛辞辨辩辰辱边达迁迅过迈迎运近返还这进迟迦迪迫述迷追退逃逆选逊透逐递途通逛逝速造逢逸逻逼遇遍道遗遭遮遵避邀邓那邦邪邮邱邻郎郑部郭都鄂酉酋配酒酷酸醉醒采释里量金针钓钟钢钦钱钻铁铃铜铢铭银铺链销锁锅锋错锡锦键锺镇镜镭长门闪闭问闰闲间闷闹闻阁阅阐阔队阮防阶阻阿陀附陆陈降限院除险陪陵陷隆随隐隔障难雄集雉雨雪雯雳零雷雾需震霍霖露霸霹青靖静非靠面革靼鞋鞑韦韩音页顶项须顽顿预领颇频颗题额风飘飙飞食餐饭饮饰饱饼馆首香馨马驱驶驻驾验骑骗骚骤骨高鬼魂魅魔鱼鲁鲜鸟鸡鸣鸭鸿鹅鹤鹰鹿麦麻黄黎黑默鼓鼠鼻齐齿龄龙龟‰〇三六﹉﹊﹋﹌＿﹍﹎﹏︳︴－﹣‐–—︱―，﹐、﹑；﹔：﹕！﹗？﹖．﹒‥︰…。·＇‘’＂“”〝〞（﹙︵）﹚︶［］｛﹛︷｝﹜︸〈︿〉﹀《︽》︾「﹁」﹂『﹃』﹄【︻】︼〔﹝︹〕﹞︺〖〗‖§＠﹫＊﹡／＼﹨＆﹠＃﹟％﹪′″‵〃※丈不丙丟並丹乎乏亂亞亦什伐伙佈佉住佔來係俠個們倫偉側傑備傢傣傳傷傾僅僑價儀億儘優充兇兒內兩兵典兼冊凱別刪刷則剌剛創劃劇劉劍功加助勁動務勝勞勢勵勸區協卜卡卻厘厭厲參及友受司吒吠吳呂咧員唔唸問啟喬單嗎嗚嘆嘗噴嚇嚴囉國圍園圓圖團圜執堅報場塊塗塵墮壇壓壘壞壢壯壽夠夢夸夾奎奧奪奮妝妳娛婁婦媽存孫學宅宜客宮密寞寢實審寫寬寮寵寶將專尋對屁屆層屬岡岩島峽崙嵐嶺市帛帥師帳帶幣幫幹幾庇庫廠廢廣廳張強彈彊彌彎彞彥從復徹恆恥悅悶惡惱愛態慘慣慮慶慾憂憐憑憲憶應懶懷懼戀成戰戲戶扥扭拋拏捨捲掃掛採推揚換揮損搖搶撐撣撥撾撿擁擇擊擋擔據擠擬擴擺擾攝敍敗敵數斷旦昇時晉暫曆曉書會東核條梨棄楊楓業極榮構槍樂樓標樞樣樹橋機橫檔檢欄權次欽歐歡歲歷歸殘殺殼毀氣決沒沖況波洩涇涼淚淨淺減測湯準溝溫滄滅滾滿漢漲漸潔潛澤濃濟濤濫濱瀏灣災為烏無煙煩熱燈燒營爐爛爭父爺爾牆牠牽犧狀猶獄獅獎獨獲獸獻珥現琉瑤瑪環產畢畫異當瘋療癡盃盜盡監盤盧盲眾瞭砲碩確碼磯礎礙祕祛祿禍禪禮稅種稱穌積穩窩窮窶竟競筆節範築簡簫簽籃籌籤粵糾紀約紅納紐純紙紛細紹終組結絕絡給統絲經綜綠維綱網緊緒線緣編緩緬緯練縛縣縮縱總績繆織繞繪繳繼續罰罵罷羅義習翹聖聞聯聰聲職聽脫腔腦腳膽臉臘臥臨臺與舊艦茅茲荼莊華萊萬葉蒲蒼蓋蓮蔕蔣蕭薦薩藍藝藥蘆蘇蘭處虛號虧螢蟲蠍蠻術衛衝補裝裡製複褲見規視親覺覽觀觸訂計訊討訓託記訥訪設許訴註証評詞詢試詩話詳誇誌認誕語誠誤說誰課誼調談請諒論諸諺諾謀謂講謝證識譜譯議護譽讀變讓讚豈豐豬貓貝貞負貢貨貪責貴買費貼賀資賈賓賜賞賢賤賦質賭賴賺購賽贈贊贏趕趙趨跎跡蹟蹤躍車軌軍軒軟較載輔輕輛輝輩輪輯輸轉轟辦辭辯農迴送這連週進遊運過違遙遜遠適遲遷選遺邁還邊邏郵鄉鄭鄰醜醫釋針釣鈴鉢銀銅銖銘銳銷鋒鋼錄錢錦錫錯鍋鍵鍾鎊鎖鎮鏡鐘鐵鑑長門閃閉開閏閒間閣閱闆闊闍闐關闡陰陳陸陽隊階際隨險隱隻雖雙雜雞離難雲電霧靂靈靜韃韋韓韻響頁頂項順須預頑頓頗領頞頭頻顆題額顏願類顧顯風飄飛飯飲飽飾餅養餘館馬駐駕駛騎騙騷驅驗驚體髮鬆鬥鬧鬱魁魚魯鮮鳥鳳鳴鴻鵝鷹麗麥麵麼黃點黨齊齋齒齡龍龜‾︲﹘†‡‧"
            if (r1 == 0) goto L285
            goto L4d
        L285:
            java.lang.String r1 = "zh_TW"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L28f
            goto L4d
        L28f:
            java.lang.String r1 = "en_US"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L29a
            java.lang.String r0 = "‰‐–—…‘’“”§†‡′″↑ "
            goto L29b
        L29a:
            r0 = r2
        L29b:
            android.ext.x0.f1307b = r0
        L29d:
            return r0
    }

    public static java.lang.StringBuilder b(java.lang.StringBuilder r17, int r18, byte[] r19, int r20, boolean r21, boolean r22, java.lang.Object r23) {
            r0 = r19
            r1 = r20
            if (r17 != 0) goto Lc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto Le
        Lc:
            r2 = r17
        Le:
            r3 = 2
            r4 = 34
            r5 = 0
            r6 = 1
            r7 = r18
            if (r7 != r3) goto L2b
            r2.append(r4)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r6 = android.ext.t1.i(r6)
            r3.<init>(r0, r5, r1, r6)
            r2.append(r3)
            r2.append(r4)
            goto L14a
        L2b:
            if (r23 != 0) goto L2f
            r7 = 0
            goto L38
        L2f:
            android.ext.x0$a r7 = new android.ext.x0$a
            r8 = r23
            android.text.Editable r8 = (android.text.Editable) r8
            r7.<init>(r8)
        L38:
            java.lang.String r8 = a()
            char[] r9 = android.ext.x0.f1306a
            int r10 = r1 + (-1)
            r11 = 0
            r12 = 0
        L42:
            if (r11 > r10) goto L13c
            r13 = r0[r11]
            r14 = 32
            if (r22 == 0) goto L60
            if (r11 >= r10) goto L60
            r15 = r13 & 255(0xff, float:3.57E-43)
            int r16 = r11 + 1
            r16 = r0[r16]
            int r16 = r16 << 8
            int r15 = r15 + r16
            int r16 = r8.indexOf(r15)
            if (r16 < 0) goto L61
        L5c:
            r3 = 34
            goto Ld6
        L60:
            r15 = 0
        L61:
            r3 = 39
            if (r13 < r14) goto L81
            r5 = 127(0x7f, float:1.78E-43)
            if (r13 == r5) goto L7f
            if (r22 == 0) goto L77
            if (r11 >= r10) goto L77
            int r5 = r11 + 1
            r5 = r0[r5]
            if (r5 != 0) goto L77
            if (r13 == r4) goto L7e
            r15 = r13
            goto L5c
        L77:
            if (r21 == 0) goto L7e
            if (r13 == r3) goto L7e
            r15 = r13
        L7c:
            r6 = 0
            goto Ld6
        L7e:
            r15 = r13
        L7f:
            r3 = 0
            goto L7c
        L81:
            if (r21 == 0) goto L7f
            r5 = -64
            if (r13 < r5) goto L7f
            r5 = -32
            r3 = 128(0x80, float:1.8E-43)
            if (r13 >= r5) goto La8
            if (r11 >= r10) goto L7f
            int r5 = r11 + 1
            r5 = r0[r5]
            r4 = r5 & 192(0xc0, float:2.69E-43)
            if (r4 != r3) goto L7f
            r3 = r13 & 31
            int r3 = r3 << 6
            r4 = r5 & 63
            r15 = r3 | r4
            int r3 = r8.indexOf(r15)
            if (r3 < 0) goto L7f
            r3 = 39
            goto Ld6
        La8:
            r4 = -16
            if (r13 >= r4) goto L7f
            int r4 = r1 + (-2)
            if (r11 >= r4) goto L7f
            int r4 = r11 + 1
            r4 = r0[r4]
            r5 = r4 & 192(0xc0, float:2.69E-43)
            if (r5 != r3) goto L7f
            int r5 = r11 + 2
            r5 = r0[r5]
            r6 = r5 & 192(0xc0, float:2.69E-43)
            if (r6 != r3) goto L7f
            r3 = r13 & 15
            int r3 = r3 << 12
            r4 = r4 & 63
            int r4 = r4 << 6
            r3 = r3 | r4
            r4 = r5 & 63
            r15 = r3 | r4
            int r3 = r8.indexOf(r15)
            if (r3 < 0) goto L7f
            r3 = 39
            r6 = 2
        Ld6:
            if (r12 == r3) goto L105
            if (r12 == 0) goto Lf6
            r2.append(r12)
            r2.append(r14)
            if (r7 == 0) goto Lf6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r5 = " "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r7.a(r4)
        Lf6:
            if (r3 == 0) goto L104
            r2.append(r3)
            if (r7 == 0) goto L104
            java.lang.String r4 = java.lang.String.valueOf(r3)
            r7.a(r4)
        L104:
            r12 = r3
        L105:
            if (r3 == 0) goto L119
            char r3 = (char) r15
            r2.append(r3)
            int r11 = r11 + r6
            if (r7 == 0) goto L117
            int r6 = r6 + 1
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.b(r6, r3)
        L117:
            r3 = 1
            goto L134
        L119:
            r3 = r13 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> 4
            char r3 = r9[r3]
            r2.append(r3)
            r3 = r13 & 15
            char r3 = r9[r3]
            r2.append(r3)
            if (r11 >= r10) goto L12e
            r2.append(r14)
        L12e:
            if (r7 == 0) goto L117
            r3 = 1
            r7.c(r3)
        L134:
            int r11 = r11 + r3
            r3 = 2
            r4 = 34
            r5 = 0
            r6 = 1
            goto L42
        L13c:
            if (r12 == 0) goto L14a
            r2.append(r12)
            if (r7 == 0) goto L14a
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r7.a(r0)
        L14a:
            return r2
    }
}
