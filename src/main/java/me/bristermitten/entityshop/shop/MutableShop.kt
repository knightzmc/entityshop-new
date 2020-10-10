package me.bristermitten.entityshop.shop

/**
 * @author AlexL
 */
interface MutableShop : Shop
{
	override var name: String

	override val wares: MutableList<Ware>

}
