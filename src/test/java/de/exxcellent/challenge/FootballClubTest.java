package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FootballClubTest {

	@Test
	void test() {
		FootballClub club = new FootballClub("BVB",40,10);
		assertEquals(30, club.difference());
	}

}
