// ***************************************************************************
// Copyright (c) 2017, Industrial Logic, Inc., All Rights Reserved.
//
// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
// used by students during Industrial Logic's workshops or by individuals
// who are being coached by Industrial Logic on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Industrial Logic, Inc.
// ****************************************************************************

package com.riotgames.example;

import java.util.EnumSet;

public class Manager extends Employee {
	protected EnumSet<Job> responsibilities() {
		return EnumSet.of(Job.MANAGE, Job.MARKET, Job.SELL);
	}
}
