window.onload = function() {
	
	var data= [{
		type: "pie",
		showInLegend: true,
		toolTipContent: "{name}: <strong>{y}%</strong>",
		indexLabel: "{name} - {y}%",
		dataPoints: [
			{ y: 17, name: "A+", exploded: true },
			{ y: 11, name: "A-" },
			{ y: 20, name: "B+" },
			{ y: 12, name: "B-" },
			{ y: 16, name: "AB+" },
			{ y: 10, name: "AB-" },
			{ y: 9, name: "O+"},
			{ y: 5, name: "O-"}
		]
	}];
	var data1= [{
		type: "column",
		name: "Campaign (In Months)",
		legendText: "Campaign",
		showInLegend: true, 
		dataPoints:[
			{ label: "January", y: 266.21 },
			{ label: "February", y: 302.25 },
			{ label: "March", y: 157.20 },
			{ label: "April", y: 148.77 },
			{ label: "May", y: 101.50 },
			{ label: "June", y: 97.8 }
		]
	},
	{
		type: "column",	
		name: "Donor (donor/day)",
		legendText: "New Donor",
		axisYType: "secondary",
		showInLegend: true,
		dataPoints:[
			{ label: "January", y: 10.46 },
			{ label: "February", y: 2.27 },
			{ label: "March", y: 3.99 },
			{ label: "April", y: 4.45 },
			{ label: "May", y: 2.92 },
			{ label: "June", y: 3.1 }
		]
	}];
	
	renderMyChart(chartContainer1, data);
	renderMyChart(chartContainer, data1);

	function renderMyChart(theDIVid, myData) {
		var chart = new CanvasJS.Chart(theDIVid, {
			data: myData
		});
		chart.render();
	}
}