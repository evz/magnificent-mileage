# Open Trip Planner - Chicago

This is an [Open Trip Planner](https://github.com/openplans/OpenTripPlanner) instance for transit routing in the city of Chicago 

The idea is to make a free, Chicago-specific routing API for developers to build transit apps on top of.

### Usage

#### [Web interface](http://ec2-54-227-63-227.compute-1.amazonaws.com/opentripplanner-webapp/)

[![Open Trip Planner Chicago](https://raw.github.com/evz/opentrip/master/screenshots/otpchicago-screenshot.png)](http://ec2-54-227-63-227.compute-1.amazonaws.com/opentripplanner-webapp/)

#### Example API call
```bash
curl --header "Accept: application/json" http://ec2-54-227-63-227.compute-1.amazonaws.com/opentripplanner-api-webapp/ws/plan \
?mode=TRANSIT%2CWALK \
&optimize=QUICK \
&maxWalkDistance=840 \
&walkSpeed=1.341 \
&date=2013-08-13 \
&toPlace=41.823781%2C-87.613907 \
&fromPlace=41.900999%2C-87.696304
```

[Open Trip Planner API call documentation](http://www.opentripplanner.org/apidoc/0.9.2/resource_Planner.html#path__plan.html)

### Potential additions

See the [issue tracker](https://github.com/evz/opentrip/issues?page=1&state=open) for details.

* walking directions (included in OTP) __done__
* driving directions (included in OTP) __done__
* biking directions (included in OTP) __done__
* CTA bus and train tracker arrival data
* Divvy bike share station availability
* Metra arrival data
* Auto traffic data from buses
* Large event information (think "stay away from the lake front trail during the air show") 

### Credits

This project is based on the [Open Trip Planner](https://github.com/openplans/OpenTripPlanner) by [OpenPlans](http://openplans.org/).

Server hosting provided by the [Smart Chicago Collaborative](http://www.smartchicagocollaborative.org/projects/hosted-web-space/)
