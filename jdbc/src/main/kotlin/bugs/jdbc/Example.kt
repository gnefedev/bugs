package bugs.jdbc

import org.springframework.jdbc.core.SqlParameterValue
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import java.sql.Types

class Example(
    private val jdbcTemplate: NamedParameterJdbcTemplate
) {
    fun anyWithArray() {
        jdbcTemplate.queryForList(
            "SELECT 1 = ANY(:args)",
            mapOf("args" to SqlParameterValue(Types.ARRAY, arrayOf(1, 2, 3)))
        )
    }
}
