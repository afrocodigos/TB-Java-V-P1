fetch('https://api.coindesk.com/v1/bpi/currentprice.json')
  .then(response => response.json())
  .then(data => {
    console.log(`O preço atual do Bitcoin é ${data.bpi.USD.rate}`);
  })
  .catch(error => {
    console.error('Erro ao consumir a API:', error);
  });