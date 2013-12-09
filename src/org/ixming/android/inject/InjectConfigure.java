package org.ixming.android.inject;

/**
 * 配置哪些需要使用动态注入。
 * <p>
 * 因为使用反射实现的缘故，当项目中的成员变量、方法等数量很多，而真正
 * 需要用到该框架的地方较少，请根据实际情况配置。
 * </p>
 * <p>
 * 默认情况下，全部支持。
 * </p>
 * @author Yin Yong
 * @version 1.0
 */
public class InjectConfigure {

	// 设置客户端是否需要动态注入成员变量对应的Res资源
	private boolean mInjectReses = true;
	// 设置客户端是否需要动态注入成员变量对应的View
	private boolean mInjectViews = true;
	
	/**
	 * 创建一个新的配置对象。
	 */
	public InjectConfigure() {}
	
	/**
	 * 设置客户端是否需要动态注入成员变量对应的Res资源
	 * @return 为了方便链式设置，返回原对象
	 */
	public InjectConfigure injectReses(boolean ifInject) {
		mInjectReses = ifInject;
		return this;
	}

	/**
	 * 设置客户端是否需要动态注入成员变量对应的View
	 * @return 为了方便链式设置，返回原对象
	 */
	public InjectConfigure injectViews(boolean ifInject) {
		mInjectViews = ifInject;
		return this;
	}
	
	/**
	 * @return 是否设置客户端是否需要动态注入成员变量对应的Res资源
	 */
	public boolean isInjectReses() {
		return mInjectReses;
	}
	
	/**
	 * @return 是否设置客户端是否需要动态注入成员变量对应的View
	 */
	public boolean isInjectViews() {
		return mInjectViews;
	}
	
	@Override
	public String toString() {
		return "InjectConfigure [mInjectReses=" + mInjectReses
				+ ", mInjectViews=" + mInjectViews + "]";
	}
}
