package com.l2jbr.gameserver.model.database;

import com.l2jbr.commons.database.annotation.Column;
import com.l2jbr.commons.database.annotation.Table;
import org.springframework.data.annotation.Id;

@Table("castle_door")
public class CastleDoor  {

    @Id
    private int id;
    private int castleId;
    private String name;
    private int x;
    private int y;
    private int z;
    @Column("range_xmin")
    private int rangeXmin;
    @Column("range_ymin")
    private int rangeYmin;
    @Column("range_zmin")
    private int rangeZmin;
    @Column("range_xmax")
    private int rangeXmax;
    @Column("range_ymax")
    private int rangeYmax;
    @Column("range_zmax")
    private int rangeZmax;
    private int hp;
    private int pDef;
    private int mDef;

    public int getCastleId() {
        return castleId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getRangeXmin() {
        return rangeXmin;
    }

    public int getRangeYmin() {
        return rangeYmin;
    }

    public int getRangeZmin() {
        return rangeZmin;
    }

    public int getRangeXmax() {
        return rangeXmax;
    }

    public int getRangeYmax() {
        return rangeYmax;
    }

    public int getRangeZmax() {
        return rangeZmax;
    }

    public int getHp() {
        return hp;
    }

    public int getpDef() {
        return pDef;
    }

    public int getmDef() {
        return mDef;
    }
}