package defpackage;

import android.util.Log;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.J;
        switch (b) {
            case 0:
                return new n((s) obj2, fj0Var, (byte) 0);
            case 1:
                return new n((q73) obj2, fj0Var, (byte) 1);
            case 2:
                return new n((hu2) obj2, fj0Var, (byte) 2);
            case 3:
                return new n((String) obj2, fj0Var, (byte) 3);
            default:
                return new n((n11) obj2, fj0Var, (byte) 4);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 1:
                ((n) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 2:
                ((n) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return ((n) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.StringBuilder] */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        ?? r10;
        String str;
        QuickJSContext create;
        Charset charset;
        String x;
        Boolean bool;
        BufferedReader bufferedReader;
        int w;
        switch (this.I) {
            case 0:
                String str2 = "QuickJS: abogus_dy.js read (";
                mu0.V(obj);
                try {
                    create = QuickJSContext.create();
                    ((s) this.J).e = create;
                    Log.d("ABogusSigner", "QuickJS: loading browser shim...");
                    create.evaluate(qx4.x("(function() {\n    // ---------- global aliases ----------\n    var g = typeof globalThis !== 'undefined' ? globalThis : this;\n    g.window = g;\n    g.self = g;\n    g.top = g;\n    g.parent = g;\n    g.frames = g;\n\n    // ---------- navigator ----------\n    g.navigator = {\n        userAgent: 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36',\n        appVersion: '5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36',\n        platform: 'Win32',\n        vendor: 'Google Inc.',\n        language: 'zh-CN',\n        languages: ['zh-CN', 'zh', 'en'],\n        cookieEnabled: true,\n        onLine: true,\n        hardwareConcurrency: 8,\n        maxTouchPoints: 0,\n        deviceMemory: 8,\n        plugins: { length: 0 },\n        mimeTypes: { length: 0 },\n        connection: { effectiveType: '4g', downlink: 10, rtt: 50 },\n        webdriver: false,\n        vendorSubs: { ink: Date.now() }\n    };\n\n    // ---------- screen ----------\n    g.screen = {\n        width: 1920,\n        height: 1080,\n        availWidth: 1920,\n        availHeight: 1040,\n        availLeft: 0,\n        availTop: 0,\n        colorDepth: 24,\n        pixelDepth: 24,\n        orientation: { angle: 0, type: 'landscape-primary' }\n    };\n\n    // ---------- document ----------\n    var _cookie = '';\n    g.document = {\n        body: { clientWidth: 1920, clientHeight: 1040 },\n        documentElement: { clientWidth: 1920, clientHeight: 1040 },\n        title: '',\n        domain: 'douyin.com',\n        referrer: '',\n        readyState: 'complete',\n        hidden: false,\n        visibilityState: 'visible',\n        location: { href: 'https://www.douyin.com/', protocol: 'https:', host: 'www.douyin.com', hostname: 'www.douyin.com', pathname: '/', origin: 'https://www.douyin.com' },\n        createElement: function(tag) {\n            return { tagName: tag.toUpperCase(), style: {}, classList: { add: function(){}, remove: function(){}, contains: function(){ return false; } }, setAttribute: function(){}, getAttribute: function(){ return null; }, appendChild: function(){}, removeChild: function(){}, addEventListener: function(){}, removeEventListener: function(){}, getBoundingClientRect: function(){ return {top:0,left:0,bottom:0,right:0,width:0,height:0}; }, offsetWidth: 0, offsetHeight: 0 };\n        },\n        createTextNode: function(text) {\n            return { nodeValue: text, textContent: text, data: text };\n        },\n        getElementById: function() { return null; },\n        getElementsByTagName: function() { return []; },\n        getElementsByClassName: function() { return []; },\n        querySelector: function() { return null; },\n        querySelectorAll: function() { return []; },\n        addEventListener: function() {},\n        removeEventListener: function() {},\n        createEvent: function() { return { initEvent: function(){}, preventDefault: function(){}, stopPropagation: function(){} }; }\n    };\n    // document.cookie getter/setter via defineProperty\n    Object.defineProperty(g.document, 'cookie', {\n        get: function() { return _cookie; },\n        set: function(v) {\n            var parts = v.split(';');\n            if (parts[0]) {\n                var kv = parts[0].trim();\n                var eq = kv.indexOf('=');\n                if (eq > 0) {\n                    var key = kv.substring(0, eq).trim();\n                    var val = kv.substring(eq + 1).trim();\n                    var cookies = _cookie.split('; ').filter(function(c){ return c && c.indexOf(key + '=') !== 0; });\n                    cookies.push(key + '=' + val);\n                    _cookie = cookies.join('; ');\n                }\n            }\n        }\n    });\n\n    // ---------- location ----------\n    g.location = g.document.location;\n\n    // ---------- window dimensions ----------\n    g.innerWidth = 1920;\n    g.innerHeight = 1040;\n    g.outerWidth = 1920;\n    g.outerHeight = 1080;\n    g.screenX = 0;\n    g.screenY = 0;\n    g.pageXOffset = 0;\n    g.pageYOffset = 0;\n    g.scrollX = 0;\n    g.scrollY = 0;\n    g.devicePixelRatio = 1;\n\n    // ---------- XMLHttpRequest (minimal stub) ----------\n    g.XMLHttpRequest = function() {\n        this.readyState = 0;\n        this.status = 0;\n        this.statusText = '';\n        this.responseText = '';\n        this.responseURL = '';\n        this.withCredentials = false;\n        this.__method = '';\n        this.__url = '';\n        this.__headers = {};\n        this.__body = null;\n    };\n    g.XMLHttpRequest.UNSENT = 0;\n    g.XMLHttpRequest.OPENED = 1;\n    g.XMLHttpRequest.HEADERS_RECEIVED = 2;\n    g.XMLHttpRequest.LOADING = 3;\n    g.XMLHttpRequest.DONE = 4;\n    g.XMLHttpRequest.prototype.open = function(method, url, async, user, pass) {\n        this.__method = method;\n        this.__url = url;\n        this.readyState = 1;\n    };\n    g.XMLHttpRequest.prototype.send = function(body) {\n        this.__body = body || null;\n    };\n    g.XMLHttpRequest.prototype.abort = function() {};\n    g.XMLHttpRequest.prototype.setRequestHeader = function(name, value) {\n        this.__headers[name] = value;\n    };\n    g.XMLHttpRequest.prototype.getResponseHeader = function() { return null; };\n    g.XMLHttpRequest.prototype.getAllResponseHeaders = function() { return ''; };\n    g.XMLHttpRequest.prototype.addEventListener = function() {};\n    g.XMLHttpRequest.prototype.removeEventListener = function() {};\n\n    // ---------- fetch (stub) ----------\n    g.fetch = function(input, init) {\n        return Promise.resolve({ ok: true, status: 200, json: function(){ return Promise.resolve({}); }, text: function(){ return Promise.resolve(''); } });\n    };\n\n    // ---------- timers ----------\n    var _timerId = 0;\n    g.setTimeout = function(fn, ms) { var id = ++_timerId; if (typeof fn === 'function') { try { fn(); } catch(e) {} } return id; };\n    g.setInterval = function(fn, ms) { return ++_timerId; };\n    g.clearTimeout = function(id) {};\n    g.clearInterval = function(id) {};\n    g.requestAnimationFrame = function(fn) { return ++_timerId; };\n    g.cancelAnimationFrame = function(id) {};\n\n    // ---------- localStorage / sessionStorage ----------\n    var _storage = {};\n    g.localStorage = {\n        getItem: function(k) { return _storage[k] || null; },\n        setItem: function(k, v) { _storage[k] = String(v); },\n        removeItem: function(k) { delete _storage[k]; },\n        clear: function() { _storage = {}; },\n        get length() { return Object.keys(_storage).length; },\n        key: function(i) { return Object.keys(_storage)[i] || null; }\n    };\n    g.sessionStorage = g.localStorage;\n\n    // ---------- crypto ----------\n    g.crypto = {\n        getRandomValues: function(arr) {\n            for (var i = 0; i < arr.length; i++) {\n                arr[i] = Math.floor(Math.random() * 256);\n            }\n            return arr;\n        },\n        subtle: {\n            digest: function() { return Promise.resolve(new ArrayBuffer(32)); }\n        }\n    };\n\n    // ---------- performance ----------\n    var _perfStart = Date.now();\n    g.performance = {\n        now: function() { return Date.now() - _perfStart; },\n        timing: { navigationStart: _perfStart, fetchStart: _perfStart, domainLookupStart: _perfStart, domainLookupEnd: _perfStart, connectStart: _perfStart, connectEnd: _perfStart, requestStart: _perfStart, responseStart: _perfStart, responseEnd: _perfStart, domLoading: _perfStart, domInteractive: _perfStart, domContentLoadedEventStart: _perfStart, domContentLoadedEventEnd: _perfStart, domComplete: _perfStart, loadEventStart: _perfStart, loadEventEnd: _perfStart },\n        getEntries: function() { return []; },\n        getEntriesByType: function() { return []; },\n        getEntriesByName: function() { return []; },\n        mark: function() {},\n        measure: function() {}\n    };\n\n    // ---------- atob / btoa ----------\n    var _b64 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';\n    g.btoa = function(s) {\n        var r = '';\n        for (var i = 0; i < s.length; i += 3) {\n            var n = s.charCodeAt(i) << 16 | (s.charCodeAt(i+1) || 0) << 8 | (s.charCodeAt(i+2) || 0);\n            for (var j = 0; j < 4; j++) {\n                if (i * 8 + j * 6 <= s.length * 8) r += _b64.charAt((n >>> 6 * (3 - j)) & 63);\n                else r += '=';\n            }\n        }\n        return r;\n    };\n    g.atob = function(s) {\n        var b64 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';\n        s = s.replace(/\\s/g, '');\n        var r = '';\n        for (var i = 0; i < s.length; i += 4) {\n            var n = 0, cnt = 0;\n            for (var j = 0; j < 4; j++) {\n                if (i + j < s.length && s.charAt(i + j) !== '=') {\n                    n = (n << 6) | b64.indexOf(s.charAt(i + j));\n                    cnt++;\n                } else {\n                    n <<= 6;\n                }\n            }\n            var bytes = cnt - 1;\n            for (var j = 2; j > 2 - bytes; j--) {\n                r += String.fromCharCode((n >>> (j * 8)) & 255);\n            }\n        }\n        return r;\n    };\n\n    // ---------- misc ----------\n    g.history = { pushState: function(){}, replaceState: function(){}, go: function(){}, back: function(){}, forward: function(){}, length: 0 };\n    g.alert = function(){};\n    g.confirm = function(){ return true; };\n    g.prompt = function(){ return ''; };\n    g.open = function(){ return null; };\n    g.close = function(){};\n    g.focus = function(){};\n    g.blur = function(){};\n    g.print = function(){};\n    g.getComputedStyle = function() { return new Proxy({}, { get: function(t, p) { return ''; } }); };\n    g.matchMedia = function() { return { matches: false, addListener: function(){}, removeListener: function(){}, addEventListener: function(){}, removeEventListener: function(){} }; };\n    g.Image = function() { return {}; };\n    g.MutationObserver = function() { return { observe: function(){}, disconnect: function(){}, takeRecords: function(){ return []; } }; };\n    g.IntersectionObserver = function() { return { observe: function(){}, disconnect: function(){} }; };\n    g.ResizeObserver = function() { return { observe: function(){}, disconnect: function(){} }; };\n    g.Worker = function() { return { postMessage: function(){}, terminate: function(){} }; };\n    g.Event = function(type) { this.type = type; };\n    g.CustomEvent = function(type, opts) { this.type = type; this.detail = opts ? opts.detail : null; };\n    g.MessageChannel = function() { this.port1 = { postMessage: function(){}, addEventListener: function(){} }; this.port2 = { postMessage: function(){}, addEventListener: function(){} }; };\n\n    // ---------- window event stubs ----------\n    g.addEventListener = function() {};\n    g.removeEventListener = function() {};\n    g.dispatchEvent = function() { return true; };\n\n    // ---------- window.onwheelx (dy_ab.js compat) ----------\n    g.onwheelx = { _Ax: '0X21' };\n\n    // ---------- console (map to no-op; QuickJS has its own) ----------\n    if (typeof g.console === 'undefined') {\n        g.console = { log: function(){}, warn: function(){}, error: function(){}, info: function(){}, debug: function(){} };\n    }\n})();", "\r", "", r10 ? 1 : 0));
                    Log.d("ABogusSigner", "QuickJS: browser shim loaded OK");
                    Log.d("ABogusSigner", "QuickJS: loading abogus_dy.js...");
                    InputStream open = ((s) this.J).a.getAssets().open("abogus_dy.js");
                    open.getClass();
                    charset = z50.a;
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(open, charset), 8192);
                    try {
                        try {
                            String u = wi4.u(bufferedReader2);
                            bufferedReader2.close();
                            x = qx4.x(u, "\r", "", r10 ? 1 : 0);
                        } finally {
                        }
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = r10;
                }
                try {
                    Log.d("ABogusSigner", "QuickJS: abogus_dy.js read (" + x.length() + " chars)");
                    create.evaluate(x);
                    Object evaluate = create.evaluate("(function(){ return typeof window.bdms !== 'undefined' && typeof window.bdms.init === 'function'; })()");
                    Boolean bool2 = evaluate instanceof Boolean ? (Boolean) evaluate : null;
                    Log.d("ABogusSigner", "QuickJS: bdms object exists: " + (bool2 != null ? bool2.booleanValue() : false));
                    Log.d("ABogusSigner", "QuickJS: calling initABogus()...");
                    Object evaluate2 = create.evaluate("initABogus()");
                    bool = evaluate2 instanceof Boolean ? (Boolean) evaluate2 : null;
                } catch (Exception e3) {
                    e = e3;
                    str2 = null;
                    Log.e("ABogusSigner", "Failed to initialise QuickJS a_bogus runtime", e);
                    Throwable cause = e.getCause();
                    for (?? r2 = str2; cause != null && r2 < 5; r2++) {
                        String simpleName = cause.getClass().getSimpleName();
                        String message = cause.getMessage();
                        if (message != null) {
                            str = jx4.f0(300, message);
                        }
                        Log.e("ABogusSigner", "  Caused by [" + r2 + "]: " + simpleName + ": " + str);
                        cause = cause.getCause();
                    }
                    ((s) this.J).a();
                    r10 = str2;
                    return Boolean.valueOf((boolean) r10);
                }
                if (!(bool != null ? bool.booleanValue() : false)) {
                    Log.e("ABogusSigner", "initABogus() returned false - bdms SDK _v not available");
                    ((s) this.J).a();
                    return Boolean.FALSE;
                }
                Object evaluate3 = create.evaluate("(function(){ return typeof getABogus === 'function' && typeof get_ab === 'function'; })()");
                Boolean bool3 = evaluate3 instanceof Boolean ? (Boolean) evaluate3 : null;
                boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
                Log.d("ABogusSigner", "QuickJS: getABogus available: " + booleanValue);
                Object evaluate4 = create.evaluate("(function(){ try { var r = getABogus('aid=6383&device_platform=webapp', ''); return r; } catch(e) { return JSON.stringify({ok:false,error:String(e)}); } })()");
                String str3 = evaluate4 instanceof String ? (String) evaluate4 : null;
                if (str3 == null) {
                    str3 = "null";
                }
                Log.d("ABogusSigner", "QuickJS: test sign result = ".concat(jx4.f0(200, str3)));
                if (!booleanValue) {
                    Log.e("ABogusSigner", "getABogus / get_ab not available after init");
                    ((s) this.J).a();
                    return Boolean.FALSE;
                }
                ((s) this.J).c = true;
                Log.i("ABogusSigner", "QuickJS a_bogus runtime initialised successfully (abogus_dy.js)");
                try {
                    Log.d("ABogusSigner", "QuickJS: loading sign.js...");
                    InputStream open2 = ((s) this.J).a.getAssets().open("sign.js");
                    open2.getClass();
                    bufferedReader = new BufferedReader(new InputStreamReader(open2, charset), 8192);
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    try {
                        String u2 = wi4.u(bufferedReader);
                        bufferedReader.close();
                        String x2 = qx4.x(qx4.x(u2, "\r", "", false), "crawler = _0x5c2014", "crawler = _0x5c2014; globalThis.__ac = crawler", false);
                        Log.d("ABogusSigner", "QuickJS: sign.js read (" + x2.length() + " chars)");
                        create.evaluate(x2);
                        try {
                            create.evaluate("try { getMSSDKSignature('', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36') } catch(e) {}");
                        } catch (Exception unused) {
                            Log.d("ABogusSigner", "QuickJS: getMSSDKSignature call threw (expected), checking __ac...");
                        }
                        Object evaluate5 = create.evaluate("(function(){ return typeof globalThis.__ac !== 'undefined' && typeof globalThis.__ac.init === 'function'; })()");
                        Boolean bool4 = evaluate5 instanceof Boolean ? (Boolean) evaluate5 : null;
                        if (bool4 != null ? bool4.booleanValue() : false) {
                            create.evaluate("globalThis.__ac.init({aid:99999999,dfp:0})");
                            ((s) this.J).d = true;
                            Log.i("ABogusSigner", "QuickJS: byted_acrawler initialised for __ac_signature");
                        } else {
                            Log.w("ABogusSigner", "QuickJS: byted_acrawler not found in sign.js");
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    Log.e("ABogusSigner", "QuickJS: failed to load sign.js", e);
                    r10 = 1;
                    return Boolean.valueOf((boolean) r10);
                }
                r10 = 1;
                return Boolean.valueOf((boolean) r10);
            case 1:
                mu0.V(obj);
                if (!((Boolean) t34.e.getValue()).booleanValue()) {
                    ((q73) this.J).a("license", new q4((byte) 9));
                }
                return wd5.a;
            case 2:
                mu0.V(obj);
                yd1 yd1Var = ((hu2) this.J).j;
                if (((List) yd1Var.e.getValue()).isEmpty()) {
                    yd1Var.f();
                }
                return wd5.a;
            case 3:
                mu0.V(obj);
                try {
                    w = Log.w("DouyinDirectApi", "tab/feed CDN distribution: " + sv2.w(new ep(qj4.z(new ep1(v24.b(new v24("v\\d+-web-prime\\.douyinvod\\.com"), (String) this.J), new yy0((byte) 7))), (byte) 6)));
                } catch (Exception e6) {
                    w = Log.w("DouyinDirectApi", "tab/feed debug failed: " + e6.getMessage());
                }
                return new Integer(w);
            default:
                mu0.V(obj);
                n11 n11Var = (n11) this.J;
                fl4 fl4Var = n11Var.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(fl4Var.h());
                if (linkedHashMap.isEmpty()) {
                    return Boolean.FALSE;
                }
                linkedHashMap.put("msToken", n11Var.E());
                fl4Var.H(o70.Z0(linkedHashMap.entrySet(), "; ", null, null, 0, new yy0((byte) 8), 30));
                return Boolean.TRUE;
        }
    }
}
