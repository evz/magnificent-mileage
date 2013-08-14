/* This program is free software: you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public License
as published by the Free Software Foundation, either version 3 of
the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.updater.bike_rental;

import org.codehaus.jackson.JsonNode;
import org.opentripplanner.routing.bike_rental.BikeRentalStation;

/**
 * Build a BikeRentalStation object from a Divvy data source JsonNode object.
 *
 * @see GenericJSONBikeRentalDataSource
 */
public class DivvyBikeRentalDataSource extends GenericJSONBikeRentalDataSource {
   public DivvyBikeRentalDataSource() {
       super("stationBeanList");
   }

   public BikeRentalStation makeStation(JsonNode node) {

       if (!node.path("statusValue").getTextValue().equals("In Service")) {
           return null;
       }


       BikeRentalStation station = new BikeRentalStation();

       station.id = node.path("id").toString();
       station.x = node.path("longitude").asDouble();
       station.y = node.path("latitude").asDouble();
       station.name =  node.path("stationName").getTextValue();
       station.bikesAvailable = node.path("availableBikes").asInt();
       station.spacesAvailable = node.path("availableDocks").asInt();

       return station;
   }
}