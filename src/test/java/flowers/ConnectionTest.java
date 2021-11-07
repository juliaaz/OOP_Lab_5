package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    Connection first;
    Connection second;

    @BeforeEach
    void setUp() {
        first = Connection.getConnection();
        second = Connection.getConnection();
    }

    @Test
    void getConnection() {
        assertEquals(first, second);
    }
}