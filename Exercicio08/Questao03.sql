SELECT 
    c.cod_comanda,
    c.data_comanda,
    c.mesa,
    c.nome_cliente,
    SUM(i.quantidade * ca.preco_unit) AS valor_total_comanda
FROM Comanda c
JOIN ItemComanda i ON c.cod_comanda = i.cod_comanda
JOIN Cardapio ca ON i.cod_cardapio = ca.cod_cardapio
GROUP BY 
    c.cod_comanda, c.data_comanda, c.mesa, c.nome_cliente
ORDER BY 
    c.data_comanda;