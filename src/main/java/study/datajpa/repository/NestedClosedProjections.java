package study.datajpa.repository;

public interface NestedClosedProjections {

    String getUsername();

    TeamiInfo getTeam();

    interface TeamiInfo {

        String getName();
    }
}
