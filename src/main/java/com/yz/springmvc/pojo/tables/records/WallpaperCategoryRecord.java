/*
 * This file is generated by jOOQ.
*/
package com.yz.springmvc.pojo.tables.records;


import com.yz.springmvc.pojo.tables.WallpaperCategory;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WallpaperCategoryRecord extends UpdatableRecordImpl<WallpaperCategoryRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -1509991492;

    /**
     * Setter for <code>wallpaper.wallpaper_category.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>wallpaper.wallpaper_category.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>wallpaper.wallpaper_category.wallpaper_id</code>.
     */
    public void setWallpaperId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>wallpaper.wallpaper_category.wallpaper_id</code>.
     */
    public String getWallpaperId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>wallpaper.wallpaper_category.category_id</code>.
     */
    public void setCategoryId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>wallpaper.wallpaper_category.category_id</code>.
     */
    public Integer getCategoryId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return WallpaperCategory.WALLPAPER_CATEGORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return WallpaperCategory.WALLPAPER_CATEGORY.WALLPAPER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return WallpaperCategory.WALLPAPER_CATEGORY.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getWallpaperId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WallpaperCategoryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WallpaperCategoryRecord value2(String value) {
        setWallpaperId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WallpaperCategoryRecord value3(Integer value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WallpaperCategoryRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WallpaperCategoryRecord
     */
    public WallpaperCategoryRecord() {
        super(WallpaperCategory.WALLPAPER_CATEGORY);
    }

    /**
     * Create a detached, initialised WallpaperCategoryRecord
     */
    public WallpaperCategoryRecord(Integer id, String wallpaperId, Integer categoryId) {
        super(WallpaperCategory.WALLPAPER_CATEGORY);

        set(0, id);
        set(1, wallpaperId);
        set(2, categoryId);
    }
}
