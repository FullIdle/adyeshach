package ink.ptms.adyeshach.common.entity.type

import ink.ptms.adyeshach.common.entity.EntityTypes

/**
 * @author sky
 * @date 2020/8/4 23:15
 */
open class AdySkeleton(entityTypes: EntityTypes) : AdyMob(entityTypes) {

    constructor(): this(EntityTypes.SKELETON)
}