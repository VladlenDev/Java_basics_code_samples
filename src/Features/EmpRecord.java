package Features;

import java.util.Map;

public record EmpRecord(int id, String name, long salary, Map<String, String> addresses) {
}
