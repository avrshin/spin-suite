/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.spinsuite.model;

import android.content.Context;
import android.database.Cursor;
import java.util.Date;
import org.spinsuite.base.DB;
import org.spinsuite.util.KeyNamePair;

/** Generated Model for AD_TreeBar
 *  @author Adempiere (generated) 
 *  @version Release 3.7.0LTS (1252452765) - $Id$ */
public class X_AD_TreeBar extends PO implements I_AD_TreeBar
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20141011L;

    /** Standard Constructor */
    public X_AD_TreeBar (Context ctx, int AD_TreeBar_ID, DB conn)
    {
      super (ctx, AD_TreeBar_ID, conn);
      /** if (AD_TreeBar_ID == 0)
        {
			setAD_TreeBar_ID (0);
			setAD_Tree_ID (0);
			setAD_User_ID (0);
			setNode_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_TreeBar (Context ctx, Cursor rs, DB conn)
    {
      super (ctx, rs, conn);
    }


    /** Load Meta Data */
    protected POInfo initPO (Context ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, SPS_Table_ID, get_Connection());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_AD_TreeBar[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set AD_TreeBar ID.
		@param AD_TreeBar_ID AD_TreeBar ID	  */
	public void setAD_TreeBar_ID (int AD_TreeBar_ID)
	{
		if (AD_TreeBar_ID < 1) 
			set_Value (COLUMNNAME_AD_TreeBar_ID, null);
		else 
			set_Value (COLUMNNAME_AD_TreeBar_ID, Integer.valueOf(AD_TreeBar_ID));
	}

	/** Get AD_TreeBar ID.
		@return AD_TreeBar ID	  */
	public int getAD_TreeBar_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_TreeBar_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Tree.
		@param AD_Tree_ID 
		Identifies a Tree
	  */
	public void setAD_Tree_ID (int AD_Tree_ID)
	{
		if (AD_Tree_ID < 1) 
			set_Value (COLUMNNAME_AD_Tree_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Tree_ID, Integer.valueOf(AD_Tree_ID));
	}

	/** Get Tree.
		@return Identifies a Tree
	  */
	public int getAD_Tree_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tree_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Usuario.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get Usuario.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Node.
		@param Node_ID Node	  */
	public void setNode_ID (int Node_ID)
	{
		if (Node_ID < 0) 
			set_Value (COLUMNNAME_Node_ID, null);
		else 
			set_Value (COLUMNNAME_Node_ID, Integer.valueOf(Node_ID));
	}

	/** Get Node.
		@return Node	  */
	public int getNode_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Node_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getNode_ID()));
    }
}