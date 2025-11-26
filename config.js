/**
 * 适用于 Sub-Store 的 sing-box 输出脚本（只使用 PROXY）
 * 功能：
 * - 读取所有节点（proxies/outbounds）
 * - 全部写入 config.outbounds
 * - 所有节点 tag 全部加入 PROXY.selector
 * - 不做国家分类、不做过滤、不做自动分组
 */

function main(config, subscription, platform) {
    // 订阅可能是 clash / singbox / array
    let proxies = [];

    if (subscription.proxies) {
        // Clash 格式：需要转换
        proxies = subscription.proxies.map(p => ({
            tag: p.name,
            type: p.type === "ss" ? "shadowsocks" : p.type,
            server: p.server,
            port: p.port,
            uuid: p.uuid,
            password: p.password,
            cipher: p.cipher
        }));
    } else if (subscription.outbounds) {
        // Sing-box 格式
        proxies = subscription.outbounds;
    } else if (Array.isArray(subscription)) {
        proxies = subscription;
    } else {
        throw new Error("不支持的订阅格式");
    }

    // 收集所有 tag
    const tags = proxies.map(p => p.tag);

    // 添加全部节点到 config.outbounds
    config.outbounds = config.outbounds.concat(proxies);

    // 找到 PROXY 的 selector
    const proxySelector = config.outbounds.find(o => o.tag === "PROXY");

    if (!proxySelector) {
        throw new Error("你的 template 中必须存在 tag='PROXY' 的 selector！");
    }

    // 所有节点全部加入 PROXY
    proxySelector.outbounds = tags;

    return config;
}
