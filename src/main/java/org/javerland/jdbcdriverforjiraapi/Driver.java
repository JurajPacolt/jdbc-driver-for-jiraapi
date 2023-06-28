/* Created on 28.06.2023 */
package org.javerland.jdbcdriverforjiraapi;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author juraj.pacolt
 */
public class Driver implements java.sql.Driver {

    private static Driver instance;
    private static final Logger PARENT_LOGGER = Logger.getLogger("org.javerland.jdbcdriverforjiraapi");
    private static final Logger LOGGER = Logger.getLogger("org.javerland.jdbcdriverforjiraapi.Driver");

    static {
        register();
    }

    /**
     * Register driver.
     */
    public static void register() {
        if (instance != null) {
            return;
        }
        try {
            instance = new Driver();
            DriverManager.registerDriver(instance);
        } catch (SQLException ex) {
            throw new JDFJAException(ex.getMessage(), ex);
        }
    }

    /**
     * Unregister driver.
     */
    public static void unregister() {
        if (instance == null) {
            return;
        }
        try {
            DriverManager.deregisterDriver(instance);
            instance = null;
        } catch (SQLException ex) {
            throw new JDFJAException(ex.getMessage(), ex);
        }
    }

    @Override
    public Connection connect(String url, Properties info) throws SQLException {
        return null;
    }

    @Override
    public boolean acceptsURL(String url) throws SQLException {
        return false;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

}
