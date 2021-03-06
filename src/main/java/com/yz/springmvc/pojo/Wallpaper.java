/*
 * This file is generated by jOOQ.
*/
package com.yz.springmvc.pojo;


import com.yz.springmvc.pojo.tables.Category;
import com.yz.springmvc.pojo.tables.WallpaperCategory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Wallpaper extends SchemaImpl {

    private static final long serialVersionUID = 1809487219;

    /**
     * The reference instance of <code>wallpaper</code>
     */
    public static final Wallpaper WALLPAPER = new Wallpaper();

    /**
     * The table <code>wallpaper.category</code>.
     */
    public final Category CATEGORY = com.yz.springmvc.pojo.tables.Category.CATEGORY;

    /**
     * The table <code>wallpaper.wallpaper</code>.
     */
    public final com.yz.springmvc.pojo.tables.Wallpaper WALLPAPER_ = com.yz.springmvc.pojo.tables.Wallpaper.WALLPAPER_;

    /**
     * The table <code>wallpaper.wallpaper_category</code>.
     */
    public final WallpaperCategory WALLPAPER_CATEGORY = com.yz.springmvc.pojo.tables.WallpaperCategory.WALLPAPER_CATEGORY;

    /**
     * No further instances allowed
     */
    private Wallpaper() {
        super("wallpaper", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Category.CATEGORY,
            com.yz.springmvc.pojo.tables.Wallpaper.WALLPAPER_,
            WallpaperCategory.WALLPAPER_CATEGORY);
    }
}
