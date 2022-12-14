package ink.ptms.adyeshach.impl.nms

import ink.ptms.adyeshach.core.MinecraftWorldAccess
import taboolib.module.nms.nmsProxyClass
import java.lang.reflect.Constructor

/**
 * Adyeshach
 * ink.ptms.adyeshach.impl.nms.DefaultMinecraftWorldAccess
 *
 * @author 坏黑
 * @since 2022/6/28 00:11
 */
class DefaultMinecraftWorldAccess : MinecraftWorldAccess {

    val group: String = DefaultMinecraftWorldAccess::class.java.`package`.name

    /** 方块访问接口 **/
    val nmsBlockAccessClass = nmsProxyClass<MinecraftWorldAccess.BlockAccess>("$group.DefaultMinecraftBlockAccess")

    /** 方块访问接口构造方法 **/
    val nmsBlockAccessClassConstructor: Constructor<MinecraftWorldAccess.BlockAccess> = nmsBlockAccessClass.getDeclaredConstructor(Int::class.java, Int::class.java)

    override fun createBlockAccess(x: Int, z: Int): MinecraftWorldAccess.BlockAccess {
        return nmsBlockAccessClassConstructor.newInstance(x, z)
    }
}