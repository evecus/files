package com.whl.quickjs.wrapper;

import defpackage.hn3;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class QuickJSObject implements JSObject {
    private final QuickJSContext context;
    private final long pointer;
    private int refCount;
    private Throwable stackTrace;

    public QuickJSObject(QuickJSContext quickJSContext, long j) {
        this.context = quickJSContext;
        this.pointer = j;
        this.refCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setProperty$0(Method method, Object obj, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void setPropertyObject(String str, Object obj) {
        checkRefCountIsZero();
        this.context.setProperty(this, str, obj);
    }

    public final void checkRefCountIsZero() {
        if (isRefCountZero()) {
            throw new QuickJSException("The call threw an exception, the reference count of the current object has already reached zero.");
        }
    }

    public void convertToMap(Object obj, Object obj2, HashMap<Long, Object> hashMap, MapFilter mapFilter, Object obj3, MapCreator mapCreator) {
        QuickJSObject quickJSObject;
        String str;
        Object property;
        HashMap<Long, Object> hashMap2 = hashMap;
        MapFilter mapFilter2 = mapFilter;
        JSObject jSObject = (JSObject) obj;
        hashMap2.put(Long.valueOf(jSObject.getPointer()), obj2);
        boolean z = obj instanceof JSArray;
        JSArray names = z ? (JSArray) obj : jSObject.getNames();
        int length = names.length();
        int i = 0;
        while (i < length) {
            if (z) {
                str = null;
                property = names.get(i);
                quickJSObject = this;
            } else {
                String str2 = (String) names.get(i);
                quickJSObject = this;
                if (mapFilter2 != null && mapFilter2.shouldSkipKey(str2, quickJSObject.pointer, obj3)) {
                    i++;
                    hashMap2 = hashMap;
                    mapFilter2 = mapFilter;
                }
                str = str2;
                property = jSObject.getProperty(str2);
            }
            boolean z2 = property instanceof JSObject;
            if (z2) {
                long pointer = ((JSObject) property).getPointer();
                if (hashMap2.containsKey(Long.valueOf(pointer))) {
                    Object obj4 = hashMap2.get(Long.valueOf(pointer));
                    if (obj2 instanceof Map) {
                        ((Map) obj2).put(str, obj4);
                    } else if (obj2 instanceof ArrayList) {
                        ((ArrayList) obj2).add(obj4);
                    }
                    i++;
                    hashMap2 = hashMap;
                    mapFilter2 = mapFilter;
                }
            }
            if (property instanceof JSFunction) {
                ((JSFunction) property).release();
            } else if (property instanceof JSArray) {
                JSArray jSArray = (JSArray) property;
                ArrayList arrayList = new ArrayList(jSArray.length());
                quickJSObject.convertToMap(property, arrayList, hashMap2, mapFilter2, obj3, mapCreator);
                if (obj2 instanceof Map) {
                    ((Map) obj2).put(str, arrayList);
                } else if (obj2 instanceof ArrayList) {
                    ((ArrayList) obj2).add(arrayList);
                }
                jSArray.release();
            } else if (z2) {
                Map<String, Object> map = mapCreator.get();
                convertToMap(property, map, hashMap, mapFilter, obj3, mapCreator);
                if (obj2 instanceof Map) {
                    ((Map) obj2).put(str, map);
                } else if (obj2 instanceof ArrayList) {
                    ((ArrayList) obj2).add(map);
                }
                ((JSObject) property).release();
            } else if (obj2 instanceof Map) {
                ((Map) obj2).put(str, property);
            } else if (obj2 instanceof ArrayList) {
                ((ArrayList) obj2).add(property);
            }
            i++;
            hashMap2 = hashMap;
            mapFilter2 = mapFilter;
        }
        if (z) {
            return;
        }
        names.release();
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void decrementRefCount() {
        checkRefCountIsZero();
        this.refCount--;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Boolean getBoolean(String str) {
        Object property = getProperty(str);
        if (property instanceof Boolean) {
            return (Boolean) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Boolean getBooleanProperty(String str) {
        return getBoolean(str);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public byte[] getBytes(String str) {
        Object property = getProperty(str);
        if (property instanceof byte[]) {
            return (byte[]) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public QuickJSContext getContext() {
        return this.context;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Double getDouble(String str) {
        Object property = getProperty(str);
        if (property instanceof Double) {
            return (Double) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Double getDoubleProperty(String str) {
        return getDouble(str);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Integer getIntProperty(String str) {
        return getInteger(str);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Integer getInteger(String str) {
        Object property = getProperty(str);
        if (property instanceof Integer) {
            return (Integer) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public JSArray getJSArray(String str) {
        Object property = getProperty(str);
        if (property instanceof JSArray) {
            return (JSArray) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public JSArray getJSArrayProperty(String str) {
        return getJSArray(str);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public JSFunction getJSFunction(String str) {
        Object property = getProperty(str);
        if (property instanceof JSFunction) {
            return (JSFunction) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public JSFunction getJSFunctionProperty(String str) {
        return getJSFunction(str);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public JSObject getJSObject(String str) {
        Object property = getProperty(str);
        if (property instanceof JSObject) {
            return (JSObject) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public JSObject getJSObjectProperty(String str) {
        return getJSObject(str);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Long getLong(String str) {
        Object property = getProperty(str);
        if (property instanceof Long) {
            return (Long) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public JSArray getNames() {
        checkRefCountIsZero();
        return (JSArray) this.context.getOwnPropertyNames(this);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public JSArray getOwnPropertyNames() {
        return getNames();
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public long getPointer() {
        return this.pointer;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Object getProperty(String str) {
        checkRefCountIsZero();
        return this.context.getProperty(this, str);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public int getRefCount() {
        return this.refCount;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Throwable getStackTrace() {
        return this.stackTrace;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public String getString(String str) {
        Object property = getProperty(str);
        if (property instanceof String) {
            return (String) property;
        }
        return null;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public String getStringProperty(String str) {
        return getString(str);
    }

    public int hashCode() {
        return Arrays.hashCode(new long[]{this.pointer});
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void hold() {
        checkRefCountIsZero();
        this.refCount++;
        this.context.hold(this);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public boolean isAlive() {
        return !isRefCountZero();
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public boolean isRefCountZero() {
        return this.refCount == 0;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void release() {
        if (isRefCountZero()) {
            return;
        }
        this.refCount--;
        this.context.freeValue(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    @Override // com.whl.quickjs.wrapper.JSObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProperty(java.lang.String r8, java.lang.Class<?> r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r9.newInstance()     // Catch: java.lang.InstantiationException -> L5 java.lang.IllegalAccessException -> La
            goto Lf
        L5:
            r0 = move-exception
            r0.printStackTrace()
            goto Le
        La:
            r0 = move-exception
            r0.printStackTrace()
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L3f
            com.whl.quickjs.wrapper.QuickJSContext r1 = r7.context
            com.whl.quickjs.wrapper.JSObject r1 = r1.createNewJSObject()
            java.lang.reflect.Method[] r9 = r9.getMethods()
            int r2 = r9.length
            r3 = 0
        L1d:
            if (r3 >= r2) goto L38
            r4 = r9[r3]
            java.lang.Class<com.whl.quickjs.wrapper.JSMethod> r5 = com.whl.quickjs.wrapper.JSMethod.class
            boolean r5 = r4.isAnnotationPresent(r5)
            if (r5 == 0) goto L35
            java.lang.String r5 = r4.getName()
            lz3 r6 = new lz3
            r6.<init>()
            r1.setProperty(r5, r6)
        L35:
            int r3 = r3 + 1
            goto L1d
        L38:
            r7.setProperty(r8, r1)
            r1.release()
            return
        L3f:
            java.lang.String r7 = "The JavaObj cannot be null. An error occurred in newInstance!"
            defpackage.zy.m(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whl.quickjs.wrapper.QuickJSObject.setProperty(java.lang.String, java.lang.Class):void");
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setStackTrace(Throwable th) {
        this.stackTrace = th;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public String stringify() {
        checkRefCountIsZero();
        return this.context.stringify(this);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray(MapFilter mapFilter, Object obj, MapCreator mapCreator) {
        throw new UnsupportedOperationException("Object types are not yet supported for conversion to array. You should use toMap.");
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public Map<String, Object> toMap(MapFilter mapFilter, Object obj, MapCreator mapCreator) {
        Map<String, Object> map = mapCreator.get();
        HashMap<Long, Object> hashMap = new HashMap<>();
        convertToMap(this, map, hashMap, mapFilter, obj, mapCreator);
        hashMap.clear();
        return map;
    }

    public String toString() {
        checkRefCountIsZero();
        JSFunction jSFunction = getJSFunction("toString");
        String str = (String) jSFunction.call(new Object[0]);
        jSFunction.release();
        return str;
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray() {
        return toArray(null);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public ArrayList<Object> toArray(MapFilter mapFilter) {
        return toArray(mapFilter, null, null);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public HashMap<String, Object> toMap(MapFilter mapFilter) {
        return (HashMap) toMap(mapFilter, null, new hn3((byte) 3));
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public HashMap<String, Object> toMap() {
        return toMap(null);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setProperty(String str, int i) {
        setPropertyObject(str, Integer.valueOf(i));
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setProperty(String str, long j) {
        setPropertyObject(str, Long.valueOf(j));
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setProperty(String str, JSObject jSObject) {
        setPropertyObject(str, jSObject);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setProperty(String str, boolean z) {
        setPropertyObject(str, Boolean.valueOf(z));
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setProperty(String str, double d) {
        setPropertyObject(str, Double.valueOf(d));
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setProperty(String str, byte[] bArr) {
        setPropertyObject(str, bArr);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setProperty(String str, JSCallFunction jSCallFunction) {
        setPropertyObject(str, jSCallFunction);
    }

    @Override // com.whl.quickjs.wrapper.JSObject
    public void setProperty(String str, String str2) {
        setPropertyObject(str, str2);
    }
}
