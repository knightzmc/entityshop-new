package me.bristermitten.entityshop.shop.impl

import me.bristermitten.entityshop.shop.Shop
import me.bristermitten.entityshop.shop.Ware

/**
 * @author AlexL
 */
abstract class AbstractShop(override val name: String) : Shop
{
	protected val items = mutableListOf<Ware>()
	override val wares: List<Ware> = items
}
