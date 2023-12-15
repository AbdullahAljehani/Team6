public class IntersectionDistance {
    private Intersection intersection;
    private double distanceToStart;
    private double distanceToDestination;

    IntersectionDistance(Intersection intersection, double distanceToStart, double distanceToDestination) {
        this.intersection = intersection;
        this.distanceToStart = distanceToStart;
        this.distanceToDestination = distanceToDestination;
    }

    Intersection getIntersection() {
        return intersection;
    }

    double getDistanceToStart() {
        return distanceToStart;
    }

    double getDistanceToDestination() {
        return distanceToDestination;
    }
}
