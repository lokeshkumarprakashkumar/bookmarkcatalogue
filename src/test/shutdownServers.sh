#!/bin/bash
echo "$(date) - stopping..."
docker-compose -f src/docker-compose.yml down -v
echo "$(date) - done."