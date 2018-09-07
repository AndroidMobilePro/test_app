package com.jewelfruits2019.funyjewelfruits.entity;

import org.anddev.andengine.opengl.texture.region.TextureRegion;

import static com.jewelfruits2019.funyjewelfruits.constants.IConstants.CELLBG_HEIGHT;
import static com.jewelfruits2019.funyjewelfruits.constants.IConstants.CELLBG_WIDTH;

/**
 * ICell接口的实现类——背景单元格
 * @author Qingfeng
 * @since 2010-11-03
 */
public class BackgroundCell extends ICell {

	// ===========================================================
	// Constructors
	// ===========================================================

	public BackgroundCell(final int pCellX, final int pCellY, final TextureRegion pTextureRegion) {
		super(pCellX * CELLBG_WIDTH, pCellY * CELLBG_HEIGHT, CELLBG_WIDTH, CELLBG_HEIGHT, pTextureRegion);
	}	
}
