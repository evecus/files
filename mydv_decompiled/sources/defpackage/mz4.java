package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class mz4 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public mz4(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        lz4 lz4Var = new lz4(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = lz4Var.a;
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    } else if (name2.equals("group")) {
                        lz4Var.b = 0;
                        lz4Var.c = 0;
                        lz4Var.d = 0;
                        lz4Var.e = 0;
                        lz4Var.f = true;
                        lz4Var.g = true;
                    } else if (name2.equals("item")) {
                        if (!lz4Var.h) {
                            ly2 ly2Var = lz4Var.z;
                            if (ly2Var == null || !ly2Var.b.hasSubMenu()) {
                                lz4Var.h = true;
                                lz4Var.b(menu2.add(lz4Var.b, lz4Var.i, lz4Var.j, lz4Var.k));
                            } else {
                                lz4Var.h = true;
                                lz4Var.b(menu2.addSubMenu(lz4Var.b, lz4Var.i, lz4Var.j, lz4Var.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    Context context = this.c;
                    if (equals) {
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qz3.p);
                        lz4Var.b = obtainStyledAttributes.getResourceId(1, 0);
                        lz4Var.c = obtainStyledAttributes.getInt(3, 0);
                        lz4Var.d = obtainStyledAttributes.getInt(4, 0);
                        lz4Var.e = obtainStyledAttributes.getInt(5, 0);
                        lz4Var.f = obtainStyledAttributes.getBoolean(2, true);
                        lz4Var.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, qz3.q);
                            lz4Var.i = obtainStyledAttributes2.getResourceId(2, 0);
                            lz4Var.j = (obtainStyledAttributes2.getInt(5, lz4Var.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, lz4Var.d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            lz4Var.k = obtainStyledAttributes2.getText(7);
                            lz4Var.l = obtainStyledAttributes2.getText(8);
                            lz4Var.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            lz4Var.n = string == null ? (char) 0 : string.charAt(0);
                            lz4Var.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            lz4Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                            lz4Var.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                lz4Var.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                lz4Var.r = lz4Var.e;
                            }
                            lz4Var.s = obtainStyledAttributes2.getBoolean(3, false);
                            lz4Var.t = obtainStyledAttributes2.getBoolean(4, lz4Var.f);
                            lz4Var.u = obtainStyledAttributes2.getBoolean(1, lz4Var.g);
                            lz4Var.v = obtainStyledAttributes2.getInt(21, -1);
                            lz4Var.y = obtainStyledAttributes2.getString(12);
                            lz4Var.w = obtainStyledAttributes2.getResourceId(13, 0);
                            lz4Var.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && lz4Var.w == 0 && lz4Var.x == null) {
                                lz4Var.z = (ly2) lz4Var.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                lz4Var.z = null;
                            }
                            lz4Var.A = obtainStyledAttributes2.getText(17);
                            lz4Var.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                lz4Var.D = h41.b(obtainStyledAttributes2.getInt(19, -1), lz4Var.D);
                            } else {
                                lz4Var.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = z9.b(context, resourceId)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                lz4Var.C = colorStateList;
                            } else {
                                lz4Var.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            lz4Var.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            lz4Var.h = true;
                            SubMenu addSubMenu = menu2.addSubMenu(lz4Var.b, lz4Var.i, lz4Var.j, lz4Var.k);
                            lz4Var.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof sx2)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof sx2) {
                    sx2 sx2Var = (sx2) menu;
                    if (!sx2Var.p) {
                        sx2Var.z();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((sx2) menu).y();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((sx2) menu).y();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
