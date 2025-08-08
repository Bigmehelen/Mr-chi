USE cape_codd;
SELECT SKU, SKU_Description, WarehouseID, QuantityOnHand
from inventory
where QuantityOnHand > 1 and QuantityOnHand < 10;