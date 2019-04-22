
var chart = new CanvasJS.Chart("chartContainer", {
		animationEnabled: true,
		title:{
			
		},	
		axisY: {
			title: "No of Campaign/Donor",
			titleFontColor: "#4F81BC",
			lineColor: "#4F81BC",
			labelFontColor: "#4F81BC",
			tickColor: "#4F81BC"
		},
		axisY2: {
			title: "Months",
			titleFontColor: "#C0504E",
			lineColor: "#C0504E",
			labelFontColor: "#C0504E",
			tickColor: "#C0504E"
		},	
		toolTip: {
			shared: true
		},
		legend: {
			cursor:"pointer",
			itemclick: toggleDataSeries
		},
		data: [{
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
		}]
	});	
	
var chart1 = new CanvasJS.Chart("chartContainer1", {
	exportEnabled: true,
	animationEnabled: true,
	title:{
		
	},
	legend:{
		cursor: "pointer",
		itemclick: explodePie
	},
	data: [{
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
	}]
});

chart.render();
chart1.render();


window.onload = function () {
	function explodePie (e) {
		if(typeof (e.dataSeries.dataPoints[e.dataPointIndex].exploded) === "undefined" || !e.dataSeries.dataPoints[e.dataPointIndex].exploded) {
			e.dataSeries.dataPoints[e.dataPointIndex].exploded = true;
			console.log("fhdfhgf2");
		} else {
			e.dataSeries.dataPoints[e.dataPointIndex].exploded = false;
			console.log("fhdfhgf3");
		}
		e.chart1.render();
	}
	function toggleDataSeries(e) {
		if (typeof(e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
			e.dataSeries.visible = false;
		}
		else {
			e.dataSeries.visible = true;
		}
		chart.render();
	}
}


